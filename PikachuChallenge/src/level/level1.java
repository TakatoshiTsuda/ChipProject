/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level;

import engine.*;
import graphics.Elements;

/**
 * Kelas untuk merepresentasikan Level 1 pada game Pikachu Challenge
 * @author Adam Hafidz F
 */
public class level1 extends levelBase {

    /**
     * Override method createLevel dari super class
     * Method untuk membuat level baru pada game
     */
    @Override
    public void createLevel() {
        
        icTotal = 3; //jumlah IC total pada level ini
        
        /**
         * Mengisi Array Elements dengan floor
         */
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                ele[i][j] = this.floor;
            }
        }
        
        /**
         * Menentukan posisi wall bagian atas
         */
        for (int i = 0; i < 11; i++) {
            ele[i][0] = this.wall;
        }
        
        
        /**
         * Menentukan posisi wall bagian bawah
         */
        for (int i = 0; i < 11; i++) {
            ele[i][10] = this.wall;
        }
        
        /**
         * Menentukan posisi wall bagian kiri
         */
        for (int i = 0; i < 11; i++) {
            ele[0][i] = this.wall;
        }
        
        /**
         * Menentukan posisi wall bagian kanan
         */
        for (int i = 0; i < 11; i++) {
            ele[10][i] = this.wall;
        }
        
        /**
         * Menentukan posisi finish box
         */
        ele[9][9] = finish;
        
        /**
         * Menentukan posisi barrier
         */
        ele[8][9] = barrier;
        ele[9][8] = barrier;
        
        /**
         * Menentukan posisi IC
         */
        ele[2][2] = ic;
        ele[2][3] = ic;
        ele[2][4] = ic;
        
        /**
         * Menentukan posisi fire floor
         */
        ele[3][3] = fire;
        
        /**
         * Menentukan posisi water floor
         */
        ele[3][4] = water;
        
        /**
         * Menentukan posisi water shoes
         */
        ele[2][9] = waterShoes;
        
        /**
         * Menentukan posisi fire shoes
         */
        ele[2][8] = fireShoes;
    }

}
