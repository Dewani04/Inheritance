/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITB INDONESIA
 */
public class Balok {
    private int Tinggi;
    public void setTinggi (int t) {
        Tinggi=t;
    }
    public int getTinggi () {
        return Tinggi;
    }
    public int volume() {
    int V= getPanjang()*getLebar()*Tinggi;
    return V;
    }
}
