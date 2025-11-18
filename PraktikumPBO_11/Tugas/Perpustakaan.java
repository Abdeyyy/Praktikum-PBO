/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas11;

/**
 *
 * @author Advan
 */
import java.util.List;
import java.util.ArrayList;

class Buku {
    private String judul;
    
    public Buku(String judul) {
        this.judul = judul;
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}

// Komposisi
public class Perpustakaan {
    private List<Buku> daftarBuku;
    
    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
    
    public void infoPerpustakaan() {
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}

// Agregasi
class Pengarang {
    private String namaPengarang;
    private List<Buku> daftarBuku;
    
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
        this.daftarBuku = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
    daftarBuku.add(buku);
    }

    public void infoPengarang() {
        System.out.println("\nNama pengarang: " + namaPengarang);
        for (Buku buku : daftarBuku) {
            buku.infoBuku();
        }
    }
}
