/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_12;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class PraktikumPBO_12 {

    public static void main(String[] args) {
        String filePath = "data.txt";
        
        // Menulis dara ke file
        try (FileWriter writer = new FileWriter (filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrograman Berrientasi Objek.\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }
        
        // Membaca data dari file
        try (FileReader reader = new FileReader (filePath)) {
            int character;
            System.out.println("\nIsi file: ");
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file");
            e.printStackTrace();
        }
    }
}


