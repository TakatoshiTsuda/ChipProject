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

    public Rule() {
        this.dungeon = new Elements[11][11];
        levelStatus = 1;
        character = new Character();
        Point pos = new Point(1, 1);
        character.SetPos(pos);
        winStatus = false;
    }

    public void LoadLevel(Elements[][] level, int ic) {
        this.dungeon = level;
        dungeon[1][1] = character;
        totalIC = ic;
    }

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
            if (dungeon[nextY][nextX].getType().equals("wall") != true) {
                if (dungeon[nextY][nextX].getType().equals("barrier")) {
                    if (totalIC == 0) {
                        dungeon[nextY][nextX] = character;
                        dungeon[y][x] = new Floor();
                        pos = new Point(nextX, nextY);
                        character.SetPos(pos);
                    }
                } else {
                    switch (dungeon[nextY][nextX].getType()) {
                        case "fire":
//                            if (fireShoes == true) {
//                                character.setDeadStatus(false);
//                            } else {
                                character.setDeadStatus(true);
                                System.out.println("YOU LOSE");
                                break;
//                            }
                        case "water":
//                            if (waterShoes == true) {
//                                character.setDeadStatus(false);
//                            } else {
                                character.setDeadStatus(true);
                                System.out.println("YOU LOSE");
                                break;
//                            }
                        case "ic":
                            totalIC--;
                            break;
                        case "finish":
                            winStatus = true;
                            System.out.println("YOU WIN");
                            break;
                    }
                    character.walk(dir);
                    dungeon[nextY][nextX] = character;
                    dungeon[y][x] = new Floor();
                    pos = new Point(nextX, nextY);
                    character.SetPos(pos);
                }
            }
        }
    }

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
}
