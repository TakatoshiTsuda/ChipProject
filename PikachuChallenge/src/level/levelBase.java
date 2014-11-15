/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package level;

import graphics.*;

/**
 *
 * @author Adam Hafidz F
 */
public abstract class levelBase {
    //use one object for every type to reduce memory usage!
    //create one and use it over and over
    protected Elements[][] ele;
    protected Elements floor, fire, water, wall, barrier, ic, finish, fireShoes ,waterShoes;
    protected int icTotal;
    
    public levelBase()
    {
        ele=new Elements[11][11];
        this.floor= new Floor();
        this.fire = new FireFloor();
        this.water=new WaterFloor();
        this.wall = new Wall();
        this.barrier = new Barrier();
        this.ic = new IC();
        this.finish = new FinishBox();
        this.waterShoes=new WaterShoes();
        this.fireShoes=new FireShoes();
        icTotal=0;
    }
    
     public abstract void createLevel();
    
    public Elements[][] getLevel()
    {
        return ele;
    }
    public int getIcTotal()
    {
        return icTotal;
    }
}
