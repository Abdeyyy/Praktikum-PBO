/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_9;

/**
 *
 * @author Advan
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    // Method abstract
    abstract void berjalan();
    
    // Method dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}
// Kelas turunan dari Kendaraan
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}

