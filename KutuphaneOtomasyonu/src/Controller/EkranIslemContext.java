package Controller;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reyha
 */
public class EkranIslemContext<T> {
    private EkranIslemStrategy ekranIslemStrategy;
    
    public EkranIslemContext(EkranIslemStrategy strategy){
        this.ekranIslemStrategy = strategy;
    }
    
    public ArrayList<T> calistirStrategy(){
        return ekranIslemStrategy.getirBilgi();
    }
}
