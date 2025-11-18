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
        // Komposisi        
        // Membuat objek Buku
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Pemrograman Python");
        Buku buku3 = new Buku("Basis Data");
        Buku buku4 = new Buku("Big Data");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);

        System.out.println("=== Informasi Perpustakaan ===");
        perpustakaan.infoPerpustakaan();

        // Agregasi
        // Membuat pengarang baru
        Pengarang pengarang1 = new Pengarang("Tio Wibowo");
        pengarang1.tambahBuku(buku2); 
        pengarang1.tambahBuku(buku3);
        
        Pengarang pengarang2 = new Pengarang("Reza Arap");
        pengarang2.tambahBuku(buku1);
        pengarang2.tambahBuku(buku4);

        System.out.println("\n=== Informasi Pengarang ===");
        pengarang1.infoPengarang();
        pengarang2.infoPengarang();
    }
}
    
