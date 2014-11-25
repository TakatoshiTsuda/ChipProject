/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

/**
 * Kelas untuk merepresentasikan lantai api pada game
 * @author i13067
 */
public class FireFloor extends Floor
{
    /**
     * Konstruktor untuk menentukan lantai api pada floor
     */
    public FireFloor()
    {
        imgData=img.loadImageData("img//api.png");
//        test='W';
        type="fire";
    }
}
