/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas10;

/**
 *
 * @author Advan
 */
public class Tugas10 {

    public static void main(String[] args) {
        // Objek elektronik
        Pembayaran televisi = new Elektronik();
        System.out.println("Pajak televisi : " + televisi.hitungPajak(1000000));
        
        // Objek makanan
        Pembayaran burger = new Makanan();
        System.out.println("Pajak burger : " + burger.hitungPajak(30000));
    }
}
