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
        imgData = img.loadImageData("img//right.png");
//        up = new Image[2];
//        up[0] = img.loadImageData("img//back_1.png");
//        up[1] = img.loadImageData("img//back_2.png");
//        down = new Image[2];
//        down[0] = img.loadImageData("img//front_1.png");
//        down[1] = img.loadImageData("img//front_2.png");
//        left = new Image[2];
//        left[0] = img.loadImageData("img//left_1.png");
//        left[1] = img.loadImageData("img//left_2.png");
//        right = new Image[2];
//        right[0] = img.loadImageData("img//right_1.png");
//        right[1] = img.loadImageData("img//right_2.png");
        this.charUp = ("img//back.png");
        this.charDown = ("img//front.png");
        this.charLeft = ("img//left.png");
        this.charRight = ("img//right.png");
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
