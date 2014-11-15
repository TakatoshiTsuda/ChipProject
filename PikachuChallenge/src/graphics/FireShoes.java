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
public class FireShoes extends Shoes{

    public FireShoes()
    {
        test='X';
        setShoesType();
    }
    @Override
    protected void setShoesType() {
        this.shoesType="fire";
        
    }
    
}
