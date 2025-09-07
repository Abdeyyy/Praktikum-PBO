/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hewan;

/**
 *
 * @author Advan
 */
public class Main {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        Hewan anjing = new Hewan("Anjing", 4);
        kucing.suara();
        kucing.info();
        
        anjing.berlari();
    }
}



