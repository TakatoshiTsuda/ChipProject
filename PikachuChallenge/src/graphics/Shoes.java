/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 * Kelas yang merepresentasikan sepatu untuk chip pada game
 * @author maudynur
 * @author Adam Hafidz F
 */
public abstract class Shoes extends Elements{
   
    protected String shoesType; //atribut untuk menentukan jenis sepatu chip
    
    /**
     * Konstruktor untuk menginisialisasi atribut string sepatu chip
     */
    public Shoes()
    {
        this.type="shoes";
    }
    
    /**
     * Method abstrak yang akan diturunkan kepada kelas turunannya
     * Method ini akan menentukan jenis/tipe sepatu chip
     * Kelas turunan dari kelas ini adalah Kelas FireShoes dan Kelas WaterShoes
     */
    protected abstract void setShoesType();
    
    /**
     * Method untuk memberti tahu status tipe sepatu chip
     * @return tipe sepatu chip
     */
    public String getShoesType()
    {
        return this.shoesType;
    }
   
}
