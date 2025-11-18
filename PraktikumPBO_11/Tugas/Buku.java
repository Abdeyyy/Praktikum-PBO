/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas11;

/**
 *
 * @author Advan
 */
class Buku {
    private String judul;
    private Pengarang1 pengarang; // Agregasi

    public Buku(String judul, Pengarang1 pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}
