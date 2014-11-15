/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author maudynur
 */
public class WaterShoes extends Shoes{

    public WaterShoes()
    {
        test='E';
        setShoesType();
    }

    @Override
    protected void setShoesType() {
        this.shoesType="water";
        
    }
    
}
