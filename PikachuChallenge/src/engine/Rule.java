/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import java.awt.Point;

/**
 *
 * @author i13067
 */
public class Rule {
    private Elements[][] dungeon;
    private int levelStatus;
    private Character character;
    private int totalIC;
    private boolean winStatus;
    
   
    public Rule()
    {
    	this.dungeon=new Elements[11][11];
        levelStatus=1;
        character=new Character();
        Point pos=new Point(1,1);
        character.SetPos(pos);
        winStatus=false;
    }
    public void LoadLevel(Elements[][] level,int ic)
    {
        this.dungeon=level;
        dungeon[1][1]=character;
        totalIC=ic;
    }
    public void walk(int code)
    {
        int x=(int)character.getXPos();
        int y=(int)character.getYPos();
        int nextX=x;
        int nextY=y;
        String dir="";
        switch(code)
        {
            case 4:nextX=x-1;dir="left";
            case 6:nextX=x+1;dir="right";
            case 2:nextY=y-1;dir="up";
            case 8:nextY=y+1;dir="down";
        }
        if(character.isDeadStatus()!=true)
        {
            if(dungeon[nextX][nextY].getType().equals("barrier"))
            {
                if(totalIC==0)
                {
                    dungeon[nextX][nextY]=character;
                }
            }
            else if(dungeon[nextX][nextY].getType().equals("wall")!=true)
            {
                switch (dungeon[nextX][nextY].getType()) {
                    case "fire":
                        character.setDeadStatus(true);
                        break;
                    case "ic":
                        totalIC--;
                        break;
                    case "finish":
                        winStatus=true;
                        break;
                }
                character.walk(dir);
                dungeon[nextX][nextY]=character;
                dungeon[x][y]=new Floor();
                
            }
        }
        
        
    }
    public String toString()
    {
        String text="";
        for(int i=0;i<11;i++)
        {
            for(int j=0;j<11;j++)
            {
                text=text+dungeon[i][j].getTest()+"";
            }
            text=text+"\n";
        }
        return text;
    }
}
