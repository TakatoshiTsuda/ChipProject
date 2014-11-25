/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Image;

/**
 * Kelas untuk merepresentasikan chip pada game
 *
 * @author i13067
 */
public class Character extends Elements {

    private final String charUp;
//    private final Image[] up;
    private final String charDown;
//    private final Image[] down;
    private final String charLeft;
//    private final Image[] left;
    private final String charRight;
//    private final Image[] right;
    private String direction; //character sedang menghadap ke arah mana? atas, bawah, kanan, kiri? bukan buat jalan
    private boolean deadStatus; //status hidup/mati chip

    /**
     * Konstruktor untuk inisialisasi atribut Juga memasukkan gambar dan
     * menentukan arah gambar chip
     */
    public Character() {
//        test='C';

        type = "character";
        this.direction = "right";
        deadStatus = false;
        imgData = img.loadImageData("front.png");
        this.charUp = ("back.png");
        this.charDown = ("front.png");
        this.charLeft = ("left.png");
        this.charRight = ("right.png");
    }

    /**
     * Method untuk me-load gambar chip pada arah tertentu
     *
     * @param direction arah chip
     */
    public void loadImage(String direction) {
        switch (direction) {
            case "left":
                imgData = img.loadImageData(charLeft);
                break;
            case "right":
                imgData = img.loadImageData(charRight);
                break;
            case "up":
                imgData = img.loadImageData(charUp);
                break;
            default:
                imgData = img.loadImageData(charDown);
                break;
        }
    }

    /**
     * Method untuk menentukan kemana arah chip menghadap
     *
     * @param direct arah chip yang diinginkan
     * @return
     */
    public String setDirection(String direct) {
        String res = "";
        switch (direct) {
            case "left":
                res = "left";
            case "right":
                res = "right";
            case "up":
                res = "up";
            case "down":
                res = "down";
        }
        loadImage(direct);
        return res;
    }

    /**
     * Method untuk menentukan status hidup/mati chip
     *
     * @param deadStatus
     */
    public void setDeadStatus(boolean deadStatus) {
        this.deadStatus = deadStatus;
    }

    /**
     * Method untuk memberi tahu status hidup/mati chip
     *
     * @return
     */
    public boolean isDeadStatus() {
        return deadStatus;
    }
}
