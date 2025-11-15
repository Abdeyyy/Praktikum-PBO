/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_10;

/**
 *
 * @author Advan
 */
public class PraktikumPBO_10 {

    public static void main(String[] args) {
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan : " + penjumlahan.hitung(10, 5));
        
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan : " + pengurangan.hitung(10, 5));
        
    }
}

