/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITB INDONESIA
 */
public class Kaprodi extends Dosen {
    private String jurusan;
    
public Kaprodi (String nidn, String nama, String jeniskelamin, String jurusan){
    super(nidn, nama, jeniskelamin);
    this.jurusan =jurusan;
 }
public void viewKaprodi(){
    System.out.println("Jurusan :"+jurusan);
}
    
    
}
