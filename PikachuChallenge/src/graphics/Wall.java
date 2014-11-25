/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.Image;

/**
 * Kelas untuk merepresentasikan tembok penghalang pada game Chip tidak dapat
 * melewati atau menginjak tembok/wall
 * @author i13067
 */
public class Wall extends Floor {

    /**
     * Konstruktor untuk menentukan wall pada floor
     */
    public Wall() {
        imgData=img.loadImageData("img//batu.png");
//        test = 'H';
        type = "wall";
    }
}
