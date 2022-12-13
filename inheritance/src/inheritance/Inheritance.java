/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ITB INDONESIA
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Ketua ketua = new Ketua ("00120018", "Dudung Saprudung","Laki-laki",2017,2);
    Kaprodi kaprodi = new Kaprodi ("1200011", "Yuyun Saprudung", "Laki-laki", "Teknik Informatika");
    
    ketua.viewDosen();
    ketua.viewKetua();
    
    kaprodi.viewDosen();
    kaprodi.viewKaprodi();
            
    }
    
}
