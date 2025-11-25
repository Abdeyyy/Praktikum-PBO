/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_12;

/**
 *
 * @author Advan
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas Buku untuk Serialisasi
class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String toText() {
        return judul + ";" + pengarang + ";" + tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }
}

public class LibrarySystem {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek Buku ke File (Serialisasi)");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> bacaDariFileTeks();
                case 5 -> bacaDariFileSerial();
                case 6 -> {
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahun = scanner.nextInt();

        bukuList.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toText() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke buku.ser");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    private static void bacaDariFileTeks() {
        System.out.println("\n=== Daftar Buku dari buku.txt ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                System.out.println("Judul: " + data[0] + ", Pengarang: " + data[1] + ", Tahun: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat membaca buku.txt");
        }
    }

    private static void bacaDariFileSerial() {
        System.out.println("\n=== Daftar Buku dari buku.ser ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> list = (List<Buku>) ois.readObject();
            for (Buku buku : list) {
                buku.tampilkanInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak dapat membaca buku.ser");
        }
    }
}

