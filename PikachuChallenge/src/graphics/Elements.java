/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author i13067
 */
public abstract class Elements {
    //protected Image imgData;
    //protected LoadImage img;
    protected Point position;
    //for test purpose only
    protected char test;
    protected String type;
    
    public Elements()
    {
    	//this.loadImage(null);
    }
    public void SetPos(Point pos)
    {
    	this.position=pos;
    }
    private void loadImage(String imgUrl)
    {
        //img.loadImageData(imgUrl);
    }
    public double getXPos()
    {
        return position.getX();
    }
    public double getYPos()
    {
        return position.getY();
    }
    public char getTest() {
        return test;
    }
    public String getType() {
        return type;
    }
    
    
}
