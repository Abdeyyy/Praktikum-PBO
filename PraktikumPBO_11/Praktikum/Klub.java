/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_11;

/**
 *
 * @author Advan
 */

// Agregasi
import java.util.List;
import java.util.ArrayList;

class Anggota {
    private String nama;
    
    public Anggota(String nama) {
        this.nama = nama;
    }
    
    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;
    
    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }
    
    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }
    
    public void infoKlub() {
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}
