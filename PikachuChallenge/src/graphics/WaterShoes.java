/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 * Kelas untuk merepresentasikan sepatu air untuk chip pada game
 * Sepatu air dapat digunakan oleh chip untuk melewati lantai air
 * @author maudynur
 */
public class WaterShoes extends Shoes{

    /**
     * Konstruktor untuk menentukan sepatu air pada floor
     */
    public WaterShoes()
    {
        imgData=img.loadImageData("watershoes.png");
//        test='E';
        setShoesType();
    }

    /**
     * Override method super class untuk menentukan tipe sepatu air
     */
    @Override
    protected void setShoesType() {
        this.shoesType="water";
    }
    
}
