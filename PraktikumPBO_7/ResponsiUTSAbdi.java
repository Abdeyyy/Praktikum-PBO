/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts.abdi;

/**
 *
 * @author Advan
 */
// Kelas induk Produk
class Produk {
    // Atribut
    private String namaProduk;
    private int harga;

    // Constructor
    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    // Getter nama
    public String getNama() {
        return namaProduk;
    }
    
    // Setter nama
    public void setNama(
       String nama) {
       namaProduk = nama;
   }
    
    // Getter harga
    public int getHarga() {
        return harga;
    }
    
    // Setter harga
    public void setHarga(int new_harga) {
       harga = new_harga;
   }
    
    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk + "\nHarga: " + harga );
    }
}
// Kelas turunan Produk
class Elektronik extends Produk {
    int tahun;
    
    // Constructor
    public Elektronik(int tahun, String namaProduk, int harga) {
        super(namaProduk, harga);
        this.tahun = tahun;
    }
    // Override method induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + tahun + " tahun\n");
    }
} 
// Kelas turunan Produk
class Makanan extends Produk {
    String tanggalKadaluarsa;
    
    //Constructor
    public Makanan(String tanggalKadaluarsa, String namaProduk, int harga) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    // Override method induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa + "\n");
    }
} 

// Kelas induk Pegawai
class Pegawai {
    // Atribut
    private String namaPegawai;
    private int gaji;
    
    // Constructor
    public Pegawai(String namaPegawai, int gaji) {    
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter nama
    public String getNama() {
        return namaPegawai;
    }
    
    // Setter nama
    public void setNama(String nama) {
       namaPegawai = nama;
   }
    
    // Getter gaji
    public int getGaji() {
        return gaji;
    }
    
    // Setter gaji
    public void setGaji(int new_gaji) {
       gaji = new_gaji;
   }
    
    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai + "\nGaji: " + gaji );
    }
}
// Kelas turunan Pegawai
class PegawaiTetap extends Pegawai {
    int tunjangan;
    
    //Constructor
    public PegawaiTetap(int tunjangan, String namaPegawai, int gaji) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    // Override method induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan + "\n");
    }
} 
// Kelas turunan Pegawai
class PegawaiKontrak extends Pegawai {
    int bulan;
    
    // Constructor
    public PegawaiKontrak(int bulan, String namaPegawai, int gaji) {
        super(namaPegawai, gaji);
        this.bulan = bulan;
    }
    // Override method induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama kontrak: " + bulan + " bulan\n");
    }
} 

// Main class
public class ResponsiUTSAbdi {

    public static void main(String[] args) {
        // Deklarasi objek kelas Elektronik
        Elektronik laptop = new Elektronik(2,"Laptop",15000000);
        laptop.tampilkanInfo();
        
        // Deklarasi objek kelas PegawaiTetap
        PegawaiTetap pegawai1 = new PegawaiTetap(100000,"Abdi", 5000000);
        pegawai1.tampilkanInfo();
        
        // Polimorfisme kelas Produk
        Produk snack = new Makanan("2023-12-30","Snack",15000);
        snack.tampilkanInfo();
        
        // Polimorfisme kelas Pegawai
        Pegawai pegawai2 = new PegawaiKontrak(12,"Yasa",3000000);
        pegawai2.tampilkanInfo();
    }
}
