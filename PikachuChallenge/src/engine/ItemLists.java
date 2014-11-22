/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 * Kelas untuk merepresentasikan status penggunaan sepatu oleh chip
 * @author Adam Hafidz F
 */
public class ItemLists {
    
    private boolean fireShoesOn; //status sepatu api pada chip
    private boolean waterShoesOn; //status sepatu air pada chip
    
    /**
     * Konstruktor untuk menginisialisasi penggunaan atribut sepatu oleh chip
     * Penggunaan sepatu awal di set false karena chip belum mengambil sepatu
     */
    public ItemLists()
    {
        fireShoesOn=false;
        waterShoesOn=false;
    }
    
    /**
     * Method untuk memberi tahu status sepatu api pada chip
     * @return status sepatu api pada chip
     */
    public boolean isFireShoesOn() {
        return fireShoesOn;
    }
    
    /**
     * Method untuk menentukan status sepatu api pada chip
     * @param fireShoesOn status sepatu api yang diinginkan
     */
    public void setFireShoesOn(boolean fireShoesOn) {
        this.fireShoesOn = fireShoesOn;
    }
    
    /**
     * Method untuk memberi tahu status sepatu air pada chip
     * @return status sepatu air paad chip
     */
    public boolean isWaterShoesOn() {
        return waterShoesOn;
    }
    
    /**
     * Method untuk menentukan status sepatu air pada chip
     * @param waterShoesOn status sepatu air yang diinginkan
     */
    public void setWaterShoesOn(boolean waterShoesOn) {
        this.waterShoesOn = waterShoesOn;
    }
    
}
