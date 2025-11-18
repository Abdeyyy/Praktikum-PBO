/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_11;

/**
 *
 * @author Advan
 */
public class PraktikumPBO_11 {

    public static void main(String[] args) {
        // Komposisi        
        // Membuat objek Buku
        Buku buku1 = new Buku("Laut Bercerita");
        Buku buku2 = new Buku("Danau Bercerita");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println("=== Informasi Perpustakaan ===");
        perpustakaan.infoPerpustakaan();

        // Agregasi
        // Membuat objek Klub
        Anggota anggota1 = new Anggota("Diana");
        Anggota anggota2 = new Anggota("Beneviento");
        
        Klub klub = new Klub("Ravenclaw");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        
        System.out.println("\n=== Informasi Klub ===");
        klub.infoKlub();

    }
}
