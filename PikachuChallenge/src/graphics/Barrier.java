/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics;

/**
 * Kelas yang merepresentasikan penghalang finish box pada game
 * @author i13067
 */
public class Barrier extends Floor
{
    /**
     * Konstruktor untuk menentukan penghalang pada floor
     */
    public Barrier()
    {
        imgData=img.loadImageData("img//barrier.png");
        type="barrier";
        test='B';
    }
}
