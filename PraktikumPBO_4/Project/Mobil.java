/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kendaraan;
/**
 *
 * @author Advan
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;    // Atribut tambahan khusus untuk mobil
    
    // Constructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); // Memanggil constructor dari kelas induk
        this.jumlahPintu = jumlahPintu;
    }
    
    // Method untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        // Dapat mengakses kecepatanMaks karena protected
        System.out.println("Kecepatan maksimum mobil: " + kecepatanMaks + " km/h");
        System.out.println("Jumlah pintu " + jumlahPintu);
    }
    
}

