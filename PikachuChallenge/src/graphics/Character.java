/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.Image;

/**
 *
 * @author i13067
 */
public class Character extends Elements{
    
    //private final String imgCharUp = "img\\PikachuUp.jpg";
    //private final String imgCharDown = "img\\PikachuDown.jpg";
   // private final String imgCharLeft = "img\\PikachuLeft.jpg";
   // private final String imgCharRight = "img\\PikachuRight.jpg";
    //load image sekaligus di constructor, biar proses load image lebih cepat daripada load image tiap karakter bergerak
    //private final Image charUp;
    //private final Image charDown;
    //private final Image charLeft;
    //private final Image charRight;
    
    private String direction; //character sedang menghadap ke arah mana? atas, bawah, kanan, kiri? bukan buat jalan
    private boolean deadStatus;
    public Character()
    {
        test='C';
        type="character";
    	this.direction="left";
        loadImage(direction);
        deadStatus=false;
        //charUp=img.loadImageData("img\\PikachuUp.jpg");
        //charDown=img.loadImageData("img\\PikachuDown.jpg");
        //charLeft=img.loadImageData("img\\PikachuLeft.jpg");
        //charRight=img.loadImageData("img\\PikachuRight.jpg");
    }
    public void loadImage(String direction)
    {
        switch (direction) {
            case "left":
                //imgData=charLeft;
                break;
            case "right":
                //imgData=charRight;
                break;
            case "up":
                //imgData=charUp;
                break;
            default:
                //imgData=charDown;
                break;
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
    /**
     * Digunakan untuk karakter berjalan
     * @param direction arah karakter berjalan
     */
    public void walk(String direction)
    {
        if(isDeadStatus()!=true)
        {
            switch (direction) {
                case "left":
                    //this.position.setLocation(this.position.getX()-1, this.position.getY());
                    break;
                case "right":
                    //this.position.setLocation(this.position.getX()+1, this.position.getY());
                    break;
                case "up":
                    //this.position.setLocation(this.position.getX(), this.position.getY()+1);
                    break;
                default:
                    //this.position.setLocation(this.position.getX(), this.position.getY()-1);
                    break;
            }
            loadImage(direction);
            setDirection(direction);
        }
    }

    public void setDeadStatus(boolean deadStatus) {
        this.deadStatus = deadStatus;
    }

    public boolean isDeadStatus() {
        return deadStatus;
    }
    
}
