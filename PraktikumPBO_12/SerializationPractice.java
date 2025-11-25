/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_12;

import java.io.*;

// Kelas yang dapat diserialisasi
class ProdukSeri implements Serializable {
    private String namaProduk;
    private double harga;
    private int stok;
    
    public ProdukSeri (String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Harga " + harga);
        System.out.println("Stok: " + stok);
    }
}


public class SerializationPractice {
    public static void main(String[] args) {
        String filePath = "produk.ser";
        
        // Membuat objek baru
        Produk produk = new Produk("laptop", 15000000, 10);
        
        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek");
            e.printStackTrace();
        }
        
        // Membaca objek dari file (Deseriaisasi)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Produk deserializedProduk = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file: ");
            deserializedProduk.tampilkanInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek");
            e.printStackTrace();
        }
    }
}
