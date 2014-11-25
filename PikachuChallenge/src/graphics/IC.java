/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

/**
 * Kelas untuk merepresentasikan IC untuk membuka barrier pada game
 * @author i13067
 */
public class IC extends Floor
{
    /**
     * Konstruktor untuk menentukan IC pada floor
     */
    public IC()
    {
        imgData=img.loadImageData("chip.png");
//        test='T';
        type="ic";
    }
    
}
