/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

import java.awt.Image;

/**
 * Kelas untuk merepresentasikan chip pada game
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
    private boolean deadStatus; //status hidup/mati chip
    
    /**
     * Konstruktor untuk inisialisasi atribut 
     * Juga memasukkan gambar dan menentukan arah gambar chip
     */
    public Character()
    {
        test='C';
        type="character";
    	this.direction="left";
        loadImage(direction); //me-load gambar chip sesuai arah hadap chip
        deadStatus=false;
        //charUp=img.loadImageData("img\\PikachuUp.jpg");
        //charDown=img.loadImageData("img\\PikachuDown.jpg");
        //charLeft=img.loadImageData("img\\PikachuLeft.jpg");
        //charRight=img.loadImageData("img\\PikachuRight.jpg");
    }
    
    /**
     * Method untuk me-load gambar chip pada arah tertentu
     * @param direction arah chip
     */
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
    
    /**
     * Method untuk menentukan kemana arah chip menghadap
     * @param direct arah chip yang diinginkan
     * @return 
     */
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
    
    /**
     * Method untuk menentukan status hidup/mati chip 
     * @param deadStatus 
     */
    public void setDeadStatus(boolean deadStatus) {
        this.deadStatus = deadStatus;
    }
    
    /**
     * Method untuk memberi tahu status hidup/mati chip
     * @return 
     */
    public boolean isDeadStatus() {
        return deadStatus;
    }
}
