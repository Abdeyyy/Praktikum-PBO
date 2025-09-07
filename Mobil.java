/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mobil;
/**
 *
 * @author Advan
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
            
    public Mobil(String merk, String model, int tahun, String warna){
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    // Getter merk
    public String getMerk(){
        return merk;
    }
    
    // Getter model
    public String getModel(){
        return model;
    }
    
    // Getter tahun
    public int getTahun(){
        return tahun;
    }
    
    public String getWarna() {
        return warna;
    }
    
    // Setter merk
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    // Setter model
    public void setModel(String model){
        this.model = model;
    }
    
    // Setter tahun
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
    // Method ganti warna
    public void changeColor(String warna) {
        this.warna = warna;
    }
    
    // Method start engine
    void startEngine(){
        System.out.println("Mesin mobil "+ getMerk()+ " menyala");
    }
    
    // Method display info
    void displayInfo() {
        System.out.println("\nNama\t: "+ getMerk());
        System.out.println("Model\t: "+ getModel());
        System.out.println("Tahun\t: "+ getTahun());
        System.out.print("Warna\t: " + getWarna() + "\n");
    }
}


