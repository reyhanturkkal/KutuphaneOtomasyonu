package Controller;


import Controller.ButonKomutlar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reyha
 */
public class GirisYapKomut extends SistemeErisimCommand {
    private ButonKomutlar girisButonKomut;

    public GirisYapKomut(ButonKomutlar butonKomut) {
        this.girisButonKomut = butonKomut;
    }

    @Override
    public void execute() {
        girisButonKomut.temelGirisYap();
    }
}
