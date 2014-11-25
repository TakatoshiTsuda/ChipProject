/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level;

import engine.*;
import graphics.Barrier;
import graphics.Elements;
import graphics.FinishBox;
import graphics.FireFloor;
import graphics.FireShoes;
import graphics.Floor;
import graphics.IC;
import graphics.Wall;
import graphics.WaterFloor;
import graphics.WaterShoes;
import java.awt.Point;

/**
 * Kelas untuk merepresentasikan Level 1 pada game Pikachu Challenge
 *
 * @author Adam Hafidz F
 */
public class Level1 extends LevelBase {

    /**
     * Override method createLevel dari super class Method untuk membuat level
     * baru pada game
     */
    @Override
    public void createLevel() {

        icTotal = 3; //jumlah IC total pada level ini

        /**
         * Mengisi Array Elements dengan floor
         */
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                ele[i][j] = new Floor();
            }
        }

        /**
         * Menentukan posisi wall bagian atas
         */
        for (int i = 0; i < 11; i++) {
            ele[i][0] = new Wall();
        }

        /**
         * Menentukan posisi wall bagian bawah
         */
        for (int i = 0; i < 11; i++) {
            ele[i][10] = new Wall();
        }

        /**
         * Menentukan posisi wall bagian kiri
         */
        for (int i = 0; i < 11; i++) {
            ele[0][i] = new Wall();
        }

        /**
         * Menentukan posisi wall bagian kanan
         */
        for (int i = 0; i < 11; i++) {
            ele[10][i] = new Wall();
        }

        /**
         * Menentukan posisi finish box
         */
        ele[9][9] = new FinishBox();

        /**
         * Menentukan posisi barrier
         */
        ele[8][9] = new Barrier(); 
        ele[9][8] = new Barrier();

        /**
         * Menentukan posisi IC
         */
        ele[2][2] = new IC();
        ele[2][3] = new IC();
        ele[2][4] = new IC();

        /**
         * Menentukan posisi fire floor
         */
        ele[3][3] = new FireFloor();

        /**
         * Menentukan posisi water floor
         */
        ele[4][3] = new WaterFloor();

        /**
         * Menentukan posisi water shoes
         */
        ele[2][9]=new WaterShoes();

        /**
         * Menentukan posisi fire shoes
         */
        ele [2][8]=new FireShoes();
    }

}
