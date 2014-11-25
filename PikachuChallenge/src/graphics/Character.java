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

    //load image sekaligus di constructor, biar proses load image lebih cepat daripada load image tiap karakter bergerak
//    private final Image charUp;
//    private final Image[] up;
//    private final Image charDown;
//    private final Image[] down;
//    private final Image charLeft;
//    private final Image[] left;
//    private final Image charRight;
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
        loadImage(direction); //me-load gambar chip sesuai arah hadap chip
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
//        charUp = img.loadImageData("img//back.png");
//        charDown = img.loadImageData("img//front.png");
//        charLeft = img.loadImageData("img//left.png");
//        charRight = img.loadImageData("img//right.png");
    }

    /**
     * Method untuk me-load gambar chip pada arah tertentu
     *
     * @param direction arah chip
     */
    public void loadImage(String direction) {
        switch (direction) {
            case "left":
                imgData = img.loadImageData("");
                break;
            case "right":
                imgData = img.loadImageData("");
                break;
            case "up":
                imgData = img.loadImageData("");
                break;
            default:
                imgData = img.loadImageData("");
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
     * Digunakan untuk karakter berjalan
     *
     * @param direction arah karakter berjalan
     */
    public void walk(String direction) {
        if (isDeadStatus() != true) {
            if (direction.equals("left")) {
                this.position.setLocation(this.position.getX() - 1, this.position.getY());
            } else if (direction.equals("right")) {
                this.position.setLocation(this.position.getX() + 1, this.position.getY());
            } else if (direction.equals("up")) {
                this.position.setLocation(this.position.getX(), this.position.getY() - 1);
            } else if (direction.equals("down")) {
                this.position.setLocation(this.position.getX(), this.position.getY() + 1);
            }
            loadImage(direction);
            setDirection(direction);
        }
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
