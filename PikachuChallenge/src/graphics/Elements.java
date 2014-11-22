/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Image;
import java.awt.Point;

/**
 * Kelas yang merepresentasikan parent class dari objek-objek pada game
 * @author i13067
 */
public abstract class Elements {

    //protected Image imgData;
    //protected LoadImage img;

    protected Point position; //atribut Point untuk menentukan posisi
    //for test purpose only
    protected char test;
    //attribut char yang akan di print sebagai prototype tampilan ke window
    protected String type; //atribut untuk menentukan tipe dari elemen

    public Elements() {
        //this.loadImage(null);
    }
    
    /**
     * Method untuk menentukan koordinat posisi
     * @param pos koordinat posisi yang diinginkan
     */
    public void SetPos(Point pos) {
        this.position = pos;
    }
    
    /**
     * Method untuk me-load gambar
     * @param imgUrl nama file gambar yang akan di-load
     */
    private void loadImage(String imgUrl) {
        //img.loadImageData(imgUrl);
    }
    
    /**
     * Method untuk mendapatkan nilai posisi absis
     * @return posisi absis
     */
    public double getXPos() {
        return position.getX();
    }
    
    /**
     * Method untuk mendapatkan nilai posisi ordinat
     * @return posisi ordinat
     */
    public double getYPos() {
        return position.getY();
    }
    
    /**
     * Method untuk menampilkan prototype testing dari game
     * @return hasil testing yang diprint ke window
     */
    public char getTest() {
        return test;
    }
    
    /**
     * Method untuk memberi tahu tipe dari elemen
     * @return tipe dari elemen
     */
    public String getType() {
        return type;
    }
}
