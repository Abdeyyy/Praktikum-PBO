/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mobil;
/**
 *
 * @author Advan
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota","Avanza",2020,"Hitam");
        Mobil mobil2 = new Mobil("Honda","Civic", 2021,"Putih");
        
        mobil1.displayInfo();       
        mobil1.startEngine();
        mobil1.changeColor("Merah");
        mobil1.displayInfo();
        
        mobil2.displayInfo();       
        mobil2.startEngine();
        mobil2.changeColor("Hitam");
        mobil2.displayInfo();

        
    
    }
    
}

