/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kendaraan;
/**
 *
 * @author Advan
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;   // Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks; // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;      // Bisa diakses dari mana saja

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    
    // Getter dan Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan maksimum: " + kecepatanMaks);
        System.out.println("Jenis mesin: " + jenisMesin);
    }
}

