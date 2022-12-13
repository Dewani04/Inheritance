/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITB INDONESIA
 */
public class Dosen {
    private String nidn;
    private String nama;
    private String jeniskelamin;
    
public Dosen (String nidn, String nama, String jenisjelamin) {
    this.nidn = nidn;
    this.nama = nama;
    this.jeniskelamin = jeniskelamin;
}
public void viewDosen(){
    System.out.println("NIDN : "+nidn);
    System.out.println("Nama : "+nama);
    System.out.println("JenisKelamin : "+jeniskelamin);  
   }    
}
