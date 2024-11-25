/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanp7evriliaelsyabila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Evrilia Elsyabila
 */
public class Mahasiswa extends Person implements KRS{
    private String nim;
    private String prodi;
    private List<MataKuliah> daftarKRS = new ArrayList<>();

    public Mahasiswa(String nama, String id, String nim, String prodi) {
        super(nama, id);
        this.nim = nim;
        this.prodi = prodi;
    }

    @Override
    public void showInfo() {
        System.out.println("Nama: "+nama+
                ", NIM: "+nim+
                ", Prodi: "+prodi);
    }

    @Override
    public void tambahMatKul(MataKuliah mk) {
        daftarKRS.add(mk);
    }

    @Override
    public void hapusMatKul(MataKuliah mk) {
        daftarKRS.remove(mk);
    }
    
    public void showKRS() {
        System.out.println("Daftar Mata Kuliah yang diambil Oleh " + nama + " :");
        if (daftarKRS.isEmpty()) {
            System.out.println("Tidak ada mata kuliah yang diambil oleh " +nama + ".");
        } else {
            for (MataKuliah mk : daftarKRS) {
                mk.showInfo();
            }
        }
    }
    
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (MataKuliah mk : daftarKRS) {
            totalSKS += mk.sks;
        }
        return totalSKS;
    }
}
