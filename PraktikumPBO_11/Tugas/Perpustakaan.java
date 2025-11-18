/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas11;

/**
 *
 * @author Advan
 */
// Komposisi
import java.util.ArrayList;

class Perpustakaan {
    private ArrayList<Buku> daftarBuku; 

    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
            System.out.println();
        }
    }
}