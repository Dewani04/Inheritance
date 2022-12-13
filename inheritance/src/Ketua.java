/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITB INDONESIA
 */
public class Ketua extends Dosen {
    private int tahunMulai;
    private int jabatanKe;

public Ketua (String nidn, String nama, String jeniskelamin, int jabatanKe) {
    super(nidn, nama, jeniskelamin);
    this.tahunMulai = tahunMulai;
    this.jabatanKe = jabatanKe;
}   
public void viewKetua(){
    System.out.println("Tahun mulai jabatan"+tahunMulai);
    System.out.println("Jabatan Ketua Ke-:" +jabatanKe);
}    
}
