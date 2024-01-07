package Controller;


import View.PersonelGiris;
import View.OgretimElemaniGiris;
import View.OgrenciGiris;
import View.TemelAnaGiris;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reyha
 */
public class GirisFactory{

    public GirisEkrani createGiris(String girisTuru){

        if(girisTuru.equalsIgnoreCase("Personel")){
            return new PersonelGiris();
        } else if (girisTuru.equalsIgnoreCase("Ogrenci")){
            return new OgrenciGiris();
        } else if(girisTuru.equalsIgnoreCase("OgretimElemani")){
            return new OgretimElemaniGiris();
        } else if(girisTuru.equalsIgnoreCase("Temel")){
            return new TemelAnaGiris();
        }

        return null;
    }
}