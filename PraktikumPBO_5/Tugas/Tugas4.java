/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas4;

/**
 *
 * @author Advan
 */
class Hewan{
    String nama;
    String jenis;
    
    public void info() {
        System.out.println("Nama hewan: " + nama);
        System.out.println("Jenis hewan: " + jenis);
    }
}


class Kucing extends Hewan{
    String suara;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Suara kucing: " + suara);
    }
}

class Anjing extends Hewan{
    String suara;
    
    @Override
    public void info(){
        super.info();
        System.out.println("Suara anjing: " + suara);
    }
}



public class Tugas4 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Coco";
        kucing.jenis = "Anggora";
        kucing.suara = "Meow!";
        kucing.info();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "George";
        anjing.jenis = "Pitbull";
        anjing.suara = "Woof!";
        anjing.info();
    }
}
