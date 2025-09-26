/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_6;

/**
 *
 * @author Advan
 */
class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    public void makan(String makanan){
        System.out.println("Hewan makan " + makanan);
    }
    public void makan(String makanan, int jumlah){
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}

class Kucing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}

public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("Ikan"); // Memanggil method makan
        kucing.makan("Ikan", 2); // Memanggil method makan yang overload
        
        Anjing anjing = new Anjing();
        anjing.makan("Ikan"); // Memanggil method makan
        anjing.makan("Ikan", 2); // Memanggil method makan yang overload
    }
}



