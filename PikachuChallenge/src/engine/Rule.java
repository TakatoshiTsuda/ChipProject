/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import graphics.Character;
import graphics.Elements;
import graphics.FinishBox;
import graphics.FireFloor;
import graphics.Floor;
import graphics.Shoes;
import graphics.WaterFloor;
import java.awt.Point;

/**
 * Kelas untuk merepresentasikan tata cara permainan
 * @author i13067
 */
public class Rule {

    private Elements[][] dungeon; //atribut array untuk menentukan posisi objek
    private int levelStatus; //atribut untuk menentukan level pada game
    private Character character; //atribut untuk menampilkan chip
    private int totalIC; //atribut untuk menentukan jumlah chip pada game
    private boolean winStatus; //atribut untuk menentukan status menang/kalah
    private Floor floor,waterFloor,fireFloor; //atribut lantai pada game
    private ItemLists list; //atribut list barang
    private String specialFloor; //atribut untuk menampilkan fire floor/water floor

    /**
     * Konstruktor untuk inisialisasi nilai atribut
     */
    public Rule() {
        this.dungeon = new Elements[11][11];
        list=new ItemLists();
        levelStatus = 1;
        floor=new Floor();
        waterFloor=new WaterFloor();
        fireFloor=new FireFloor();
        character = new Character();
        Point pos = new Point(1, 1);
        character.SetPos(pos);
        winStatus = false;
        specialFloor="";
    }

    /**
     * Method untuk me-load level pada game
     * @param level level pada game yang akan dimainkan
     * @param ic  jumlah IC pada level
     */
    public void LoadLevel(Elements[][] level, int ic) {
        this.dungeon = level;
        dungeon[1][1] = character;
        totalIC = ic;
    }
    
    /**
     * Method untuk menjalankan chip
     * @param code penentu arah gerak chip
     */
    public void walk(int code) {
        int x = (int) character.getXPos();
        int y = (int) character.getYPos();
        Point pos;
        int nextX = x;
        int nextY = y;
        String dir = "";
        switch (code) {
            case 4:
                nextX = x - 1;
                dir = "left";
                break;
            case 6:
                nextX = x + 1;
                dir = "right";
                break;
            case 2:
                nextY = y - 1;
                dir = "up";
                break;
            case 8:
                nextY = y + 1;
                dir = "down";
                break;
        }
        if (character.isDeadStatus() != true && winStatus != true) {
            CheckNextBlock(nextY, nextX, y, x);
            character.walk(dir);
        }
    }

    /**
     * Method untuk 
     * @return 
     */
    public String toString() {
        String text = "";
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                text = text + dungeon[i][j].getTest() + "";
            }
            text = text + "\n";
        }
        return text;
    }
    
    /**
     * Method untuk mengganti lantai biasa dengan lantai api/air
     * @param oldY nilai y pada floor lama
     * @param oldX nilai x pada floor lama
     */
    private void replaceOldFloor(int oldY,int oldX)
    {
        if(specialFloor.equals("")!=true)
                    {
                        if(specialFloor.equals("fire"))
                        {
                            dungeon[oldY][oldX] =this.fireFloor;
                        }
                        else if(specialFloor.equals("water"))
                        {
                            dungeon[oldY][oldX] =this.waterFloor;
                        }
                        specialFloor="";
                    }
                    else
                    {
                        dungeon[oldY][oldX] =this.floor;
                    }
    }
    
    /**
     * Method untuk mengecek floor yang akan dituju
     * @param y nilai y baru
     * @param x nilai x baru
     * @param oldY nilai y lama
     * @param oldX nilai x lama
     */
    private void CheckNextBlock(int y,int x,int oldY,int oldX)
    { 
        String temp="";
        Point pos = new Point(x, y);
         if (dungeon[y][x].getType().equals("wall") != true) {
                if (dungeon[y][x].getType().equals("barrier")) {
                    if (totalIC == 0) {
                        dungeon[y][x] = character;
                        dungeon[oldY][oldX] = new Floor();
                        character.SetPos(pos);
                    }
                } else {
                    switch (dungeon[y][x].getType()) {
                        case "fire":
                                if (list.isFireShoesOn() == true) {
                                    temp="fire";
                                } 
                                else {
                                    character.setDeadStatus(true);
                                    System.out.println("YOU LOSE");
                                }
                                break;
                        case "water":
                                if (list.isWaterShoesOn() == true) {
                                    temp="water";
                                } 
                                else {
                                    character.setDeadStatus(true);
                                    System.out.println("YOU LOSE");
                                }
                                break;
                        case "ic":
                            totalIC--;
                            break;
                        case "finish":
                            winStatus = true;
                            System.out.println("YOU WIN");
                            break;
                        case "shoes":
                            Shoes shoes=(Shoes)dungeon[y][x];
                            if(shoes.getShoesType().equals("fire"))
                            {
                                list.setFireShoesOn(true);
                            }
                            else
                            {
                                list.setWaterShoesOn(true);
                            }
                            break;
                    }
                    replaceOldFloor(oldY,oldX);
                    specialFloor=temp;
                    character.SetPos(pos);
                    dungeon[y][x] = character;
                }
            }
    }
}