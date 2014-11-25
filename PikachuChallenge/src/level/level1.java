/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level;

import engine.*;
import graphics.Elements;
import java.awt.Point;

/**
 * Kelas untuk merepresentasikan Level 1 pada game Pikachu Challenge
 *
 * @author Adam Hafidz F
 */
public class level1 extends levelBase {

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
        for (int i = 0; i <= 550; i += 50) {
            for (int j = 0; j <= 550; j += 50) {
                Point p = new Point(i, j);
                this.floor.setPos(p);
            }
        }

        /**
         * Menentukan posisi wall bagian atas
         */
        for (int i = 0; i <= 550; i += 50) {
            Point p = new Point(i, 0);
            this.wall.setPos(p);
        }

        /**
         * Menentukan posisi wall bagian bawah
         */
        for (int i = 0; i <= 550; i += 50) {
            Point p = new Point(i, 500);
            this.wall.setPos(p);
        }

        /**
         * Menentukan posisi wall bagian kiri
         */
        for (int i = 0; i <= 550; i += 50) {
            Point p = new Point(0, i);
            this.wall.setPos(p);
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
        Point p = new Point(500, 500);
        this.finish.setPos(p);

        /**
         * Menentukan posisi barrier
         */
        Point p1 = new Point(450, 500);
        barrier.setPos(p1);
        Point p2 = new Point(500, 450);
        barrier.setPos(p2);

        /**
         * Menentukan posisi IC
         */
        Point ic1 = new Point(150, 150);
        ic.setPos(ic1);
        Point ic2 = new Point(200, 150);
        ic.setPos(ic2);
        Point ic3 = new Point(250, 150);
        ic.setPos(ic3);

        /**
         * Menentukan posisi fire floor
         */
        Point f = new Point(200, 200);
        fire.setPos(f);

        /**
         * Menentukan posisi water floor
         */
        Point w = new Point(250, 200);
        water.setPos(w);

        /**
         * Menentukan posisi water shoes
         */
        Point ws = new Point(150, 500);
        waterShoes.setPos(ws);

        /**
         * Menentukan posisi fire shoes
         */
        Point fs = new Point(150, 450);
        fireShoes.setPos(fs);
    }

}
