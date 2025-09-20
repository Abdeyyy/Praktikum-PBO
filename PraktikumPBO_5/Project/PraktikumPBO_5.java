/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_5;

/**
 *
 * @author Advan
 */

// Kelas induk
class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
} 

// Kelas menengah
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Kelas turunan mobil
class Mobil extends KendaraanDarat{
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}

// Kelas turunan mobil
class SepedaMotor extends KendaraanDarat{
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis mesin: " + jenisMesin);
    }
}


public class PraktikumPBO_5 {

    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        mobil.jumlahRoda = 2;
        motor.tampilkanInfo();
    }
}
