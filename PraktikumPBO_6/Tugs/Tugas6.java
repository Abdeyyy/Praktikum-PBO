package com.mycompany.tugas6;

import java.util.ArrayList;
import java.util.List;

abstract class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) { 
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public abstract double hitungDiskon();
}

class Buku extends Produk {  
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        double diskon = 0.1;
        return harga - (harga * diskon);
    }          
}

class Elektronik extends Produk {  
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        double diskon = 0.4;
        return harga - (harga * diskon);
    }          
}

class Pakaian extends Produk {  
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon() {
        double diskon = 0.3;
        return harga - (harga * diskon);
    }          
}

class KeranjangBelanja {
    private final List<Produk> produkList;
    
    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    
    public void tambah(Produk produk) {
        produkList.add(produk);
    }
    
    public double totalHargaSebelumDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.getHarga();
        }
        return total;
    }
    
    public double totalHargaSesudahDiskon(double diskon) {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }
    
    // untuk akses list di main
    public List<Produk> getProdukList() {
        return produkList;
    }
}

public class Tugas6 {
    public static void main(String[] args) {
        KeranjangBelanja keranjang1 = new KeranjangBelanja();
        keranjang1.tambah(new Buku("Tutorial Python", 40000));
        keranjang1.tambah(new Elektronik("Mesin cuci", 1000000));
        keranjang1.tambah(new Pakaian("Aerostreet", 45000));
        
        double diskon = 0.35;
        
        for (Produk produk : keranjang1.getProdukList()) {
            System.out.println(produk.getNama() + 
                " = Harga asli: " + produk.getHarga() + 
                " , Harga setelah diskon: " + produk.hitungDiskon());
        }
        
        System.out.println();
        System.out.println("Total harga sebelum diskon: " + keranjang1.totalHargaSebelumDiskon());
        System.out.println("Total harga setelah diskon : " + keranjang1.totalHargaSesudahDiskon(diskon));
    }
}
