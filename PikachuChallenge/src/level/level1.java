/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package level;

import engine.*;

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
                ele[i][j]=new Floor();
            }
        }
        //wall atas
        for(int i=0;i<11;i++)
        {
            ele[i][0]=new Wall();
        }
        //wall bawah
        for(int i=0;i<11;i++)
        {
            ele[i][10]=new Wall();
        }
        //wall kiri
        for(int i=0;i<11;i++)
        {
            ele[0][i]=new Wall();
        }
        //wall kanan
        for(int i=0;i<11;i++)
        {
            ele[10][i]=new Wall();
        }
        //finish
        ele[9][9]=new FinishBox();
        //barrier
        ele[8][9]=new Barrier();
        ele[9][8]=new Barrier();
        //ic
        ele[2][2]=new IC();
        ele[2][3]=new IC();
        ele[2][4]=new IC();
        //fire
        ele[3][3]=new FireFloor();
    }
    
}
