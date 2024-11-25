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
public class Dosen extends Person{
    private String nip;
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    
    public Dosen(String nama, String id, String nip){
        super(nama, id);
        this.nip = nip;
    }

    @Override
    public void showInfo() {
        System.out.println("Nama Dosen: "+nama+
                ", NIP: "+nip);
    }
    
    public void tambahMataKuliah(MataKuliah mk){
        daftarMataKuliah.add(mk);
    }
}
