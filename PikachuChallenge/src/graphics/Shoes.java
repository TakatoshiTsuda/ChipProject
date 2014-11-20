/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

/**
 *
 * @author maudynur
 * @author Adam Hafidz F
 */
public abstract class Shoes extends Elements{
   
    protected String shoesType;
    public Shoes()
    {
        this.type="shoes";
    }
    
    protected abstract void setShoesType();
    public String getShoesType()
    {
        return this.shoesType;
    }
   
}
