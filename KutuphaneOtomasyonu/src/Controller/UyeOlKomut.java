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
public class UyeOlKomut extends SistemeErisimCommand {
    private ButonKomutlar uyeButonKomut;

    public UyeOlKomut(ButonKomutlar butonKomut) {
        this.uyeButonKomut = butonKomut;
    }

    @Override
    public void execute() {
        uyeButonKomut.temelUyeOl();
    }
}
