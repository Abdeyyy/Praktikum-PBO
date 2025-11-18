/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas11;

/**
 *
 * @author Advan
 */
public class Tugas11 {

    public static void main(String[] args) {
        
        // Agregasi
        Pengarang1 p1 = new Pengarang1("Rizky Pratama");
        Pengarang1 p2 = new Pengarang1("Dewi Lestari");
        Pengarang1 p3 = new Pengarang1("Andi Setiawan");
        Pengarang1 p4 = new Pengarang1("Nadia Putri");
        Pengarang1 p5 = new Pengarang1("Budi Santoso");

        // Komposisi
        Buku buku1 = new Buku("Pemrograman Java Dasar", p1);
        Buku buku2 = new Buku("Belajar Algoritma dengan Mudah", p2);
        Buku buku3 = new Buku("Struktur Data untuk Pemula", p3);
        Buku buku4 = new Buku("Python untuk Data Science", p4);
        Buku buku5 = new Buku("Desain Database Modern", p5);

        
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);
        perpustakaan.tambahBuku(buku5);

        perpustakaan.infoPerpustakaan();
    }
}
    
