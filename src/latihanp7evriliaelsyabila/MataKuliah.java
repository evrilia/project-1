/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7evriliaelsyabila;

/**
 *
 * @author Evrilia Elsyabila
 */
public class MataKuliah {
    private String kode;
    private String namaMatKul;
    int sks;
    private String jadwalHari;
    private String jadwalJam;
    
    public MataKuliah(String kode, String namaMatKul, int sks){
        this.kode = kode;
        this.namaMatKul = namaMatKul;
        this.sks = sks;
    }
    
    public void aturJadwal(String hari, String jam){
        this.jadwalHari = hari;
        this.jadwalJam = jam;
    }
    
    public void aturJadwal(String hari){
        this.jadwalHari = hari;
    }
    
    public void showInfo(){
        System.out.println("==========");
        System.out.println("Kode MK: "+kode+
                ", Nama: "+namaMatKul+
                ", SKS: "+sks);
    }
}
