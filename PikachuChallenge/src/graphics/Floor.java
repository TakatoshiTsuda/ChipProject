/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Image;

/**
 * Kelas untuk merepresentasikan lantai/tile pada game
 *
 * @author i13067
 */
public class Floor extends Elements {

    /**
     * Konstruktor untuk menentukan lantai pada game
     */
    public Floor() {
        imgData = img.loadImageData("floor.png");
//        test='O';
        type = "floor";
    }

}
