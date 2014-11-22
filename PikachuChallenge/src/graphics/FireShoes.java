/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 * Kelas yang merepresentasikan sepatu api untuk chip pada game
 * Sepatu api dapat digunakan oleh untuk melewati lantai api
 * @author maudynur
 */
public class FireShoes extends Shoes{

    /**
     * Konstruktor untuk menentukan sepatu api pada floor 
     */
    public FireShoes()
    {
        test='X';
        setShoesType();
    }
    
    /**
     * Override method super class untuk menentukan tipe sepatu api
     */
    @Override
    protected void setShoesType() {
        this.shoesType="fire";
        
    }
    
}
