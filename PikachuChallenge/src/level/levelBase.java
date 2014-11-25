/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level;

import graphics.*;

/**
 * Kelas untuk merepresentaiskan parent class dari Kelas Level 1
 *
 * @author Adam Hafidz F
 */
public abstract class LevelBase {

    //use one object for every type to reduce memory usage!
    //create one and use it over and over
    protected Elements[][] ele; //atribut array objek kelas Elements 
    public Elements floor, fire, water, wall, barrier, ic, finish, fireShoes, waterShoes;
    //atribut yang akan muncul pada game Pikachu Challange
    protected int icTotal; //atribut untuk menentukan jumlah IC pada game

    /**
     * Konstruktor untuk inisialisasi semua atribut
     */
    public LevelBase() {
        ele = new Elements[11][11]; //ukuran array elemen 2 dimensi pada game
//        this.floor = new Floor(); //membuat objek lantai/tile
//        this.fire = new FireFloor(); //membuat objek lantai api
//        this.water = new WaterFloor(); //membuat objek lantai air
//        this.wall = new Wall(); //membuat objek tembok
//        this.barrier = new Barrier(); //membuat objek penghalang
//        this.ic = new IC(); //membuat objek IC
//        this.finish = new FinishBox(); //membuat objek finish box
//        this.waterShoes = new WaterShoes(); //membuat objek sepatu air
//        this.fireShoes = new FireShoes(); //membuat objek sepatu api
        icTotal = 0; //inisialisasi nilai awal atribut IC
    }

    /**
     * Method abstrak yang akan diturunkan kepada kelas turunannya Method untuk
     * membuat level baru Kelas turunan dari kelas ini adalah kelas Level 1
     */
    public abstract void createLevel();

    /**
     * Kelas untuk mendapatkan informasi tampilan level pada game
     *
     * @return tampilan level pada game
     */
    public Elements[][] getLevel() {
        return ele;
    }

    /**
     * Method untuk mendapatkan jumlah total IC pada game
     *
     * @return jumlah ic pada game
     */
    public int getIcTotal() {
        return icTotal;
    }
}
