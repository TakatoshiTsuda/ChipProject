/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author Adam Hafidz F
 */
public class ItemLists {
    
    private boolean fireShoesOn;
    private boolean waterShoesOn;
    
    public ItemLists()
    {
        fireShoesOn=false;
        waterShoesOn=false;
    }

    public boolean isFireShoesOn() {
        return fireShoesOn;
    }

    public void setFireShoesOn(boolean fireShoesOn) {
        this.fireShoesOn = fireShoesOn;
    }

    public boolean isWaterShoesOn() {
        return waterShoesOn;
    }

    public void setWaterShoesOn(boolean waterShoesOn) {
        this.waterShoesOn = waterShoesOn;
    }
    
}
