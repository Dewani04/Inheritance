/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITB INDONESIA
 */
public class PersegiPanjang {
    private int Panjang;
    private int Lebar;
    public void setPanjang (  int p) {
        Panjang=p;
    }
    public void setLebar ( int l) {
        Lebar=l;
    }
    public int getPanjang(){
       return Panjang;
    }  
    public int getLebar (){
        return Lebar;
    }   
    public int luas(){
        int luas=Panjang*Lebar;
        return luas;
    }
    
    }

