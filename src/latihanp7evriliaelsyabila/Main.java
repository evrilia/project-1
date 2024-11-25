/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanp7evriliaelsyabila;

/**
 *
 * @author Evrilia Elsyabila
 * 2311103065
 * S1SI07E
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("Adit", "2912", "291221");
        Mahasiswa mhs1 = new Mahasiswa("Evril", "1221", "040521", "SI");
        
        MataKuliah mk1 = new MataKuliah("SI101", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("SI102", "Basis Data", 3);
        
        mk1.aturJadwal("Senin", "06.30");
        mk2.aturJadwal("Selasa");
        
        mhs1.tambahMatKul(mk1);
        mhs1.tambahMatKul(mk2);
        
        mk1.showInfo();
        mk2.showInfo();
        dosen1.showInfo();
        mhs1.showInfo();
        
        // Menampilkan KRS yang diambil
        mhs1.showKRS();
        
        // Menampilkan Total SKS yang diambil
        System.out.println("Total SKS yang diambil: " + mhs1.hitungTotalSKS());
    }
    
}
