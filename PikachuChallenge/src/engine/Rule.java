/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

/**
 *
 * @author i13067
 */
public class Rule {
    private Object[][] dungeon;
    private int levelStatus;
    public Rule()
    {
    	this.dungeon=new Object[11][11];
        levelStatus=1;
    }
    public void LoadLevel(Object[][] level)
    {
        this.dungeon=level;
    }
}
