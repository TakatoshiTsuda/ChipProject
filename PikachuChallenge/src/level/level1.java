/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package level;

import engine.*;
import graphics.Elements;

/**
 *
 * @author Adam Hafidz F
 */
public class level1 extends levelBase{
    

    @Override
    public void createLevel() {
        icTotal=3;
        for(int i=0;i<11;i++)
        {
            for(int j=0;j<11;j++)
            {
                ele[i][j]=this.floor;
            }
        }
        //wall atas
        for(int i=0;i<11;i++)
        {
            ele[i][0]=this.wall;
        }
        //wall bawah
        for(int i=0;i<11;i++)
        {
            ele[i][10]=this.wall;
        }
        //wall kiri
        for(int i=0;i<11;i++)
        {
            ele[0][i]=this.wall;
        }
        //wall kanan
        for(int i=0;i<11;i++)
        {
            ele[10][i]=this.wall;
        }
        //finish
        ele[9][9]=finish;
        //barrier
        ele[8][9]=barrier;
        ele[9][8]=barrier;
        //ic
        ele[2][2]=ic;
        ele[2][3]=ic;
        ele[2][4]=ic;
        //fire
        ele[3][3]=fire;
        //water
        ele[3][4]=water;
        //waterShoes
        ele[2][9]=waterShoes;
        //fireShoes
        ele[2][8]=fireShoes;
    }
    
}
