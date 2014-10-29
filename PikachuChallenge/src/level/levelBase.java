/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package level;

import engine.*;

/**
 *
 * @author Adam Hafidz F
 */
public abstract class levelBase {
    
    protected Elements[][] ele;
    protected int icTotal;
    
    public levelBase()
    {
        ele=new Elements[11][11];
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
