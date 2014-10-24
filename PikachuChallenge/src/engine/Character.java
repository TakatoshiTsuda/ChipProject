/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author i13067
 */
public class Character extends Elements{
    
    private final String imgCharUp = "img\\PikachuUp.jpg";
    private final String imgCharDown = "img\\PikachuDown.jpg";
    private final String imgCharLeft = "img\\PikachuLeft.jpg";
    private final String imgCharRight = "img\\PikachuRight.jpg";
    
    private String direction; //character sedang menghadap ke arah mana? atas, bawah, kanan, kiri? bukan buat jalan
    private boolean deadStatus;
    public Character()
    {
    	this.direction="left";
        loadImage(direction);
        deadStatus=false;
        
    }
    public void loadImage(String direction)
    {
    	if(direction.equals("left"))
        {
        	imgData=img.loadImageData(imgCharLeft);
        }
        else if(direction.equals("right"))
        {
        	imgData=img.loadImageData(imgCharRight);
        }
        else if(direction.equals("up"))
        {
        	imgData=img.loadImageData(imgCharUp);
        }
        else
        {
        	imgData=img.loadImageData(imgCharDown);
        }
    }
    
    public String setDirection (String direct)
    {
        String res="";
    
    	switch (direct)
        {
            case "left": 
            	res="left";
            case "right":
            	res="right";
            case "up":
            	res="up";
            case "down":
            	res="down"; 
        }
        return res;
    }
    public void walk()
    {
        
    }
    
}
