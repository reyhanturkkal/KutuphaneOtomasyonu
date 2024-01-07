package Controller;


import View.UyeOlEkrani;
import View.GirisYapEkrani;
import java.awt.Frame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reyha
 */
public class ButonKomutlar {
    private GirisYapEkrani anaGiris;
    private UyeOlEkrani uyeEkrani;
    
    public void temelGirisYap() {
       anaGiris = new GirisYapEkrani();
       
    }

    public void VisibleGiris(){
        anaGiris.setVisible(true);
    }
    
    public void temelUyeOl() {
        Frame frame = new Frame(); // Örnek bir Frame nesnesi oluşturulduğunu varsayalım
        uyeEkrani = new UyeOlEkrani(frame,true);
        
    }
    
    public void VisibleUye(){
        uyeEkrani.setVisible(true);
    }
}

