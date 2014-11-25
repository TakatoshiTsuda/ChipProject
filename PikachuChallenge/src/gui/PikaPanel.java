/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import engine.LoadImage;
import engine.Rule;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import level.Level1;

/**
 *
 * @author AsusX450C
 */
public class PikaPanel extends JPanel implements KeyListener {

    private LoadImage load;
    private Rule rule;
    private int dir = 6;
    private Level1 level;
    Image pika;

    public PikaPanel() {
        this.load=new LoadImage();
        this.pika=load.loadImageData("img//pika.png");
        setPreferredSize(new Dimension(720, 560));
        addKeyListener(this);
        level = new Level1();
        level.createLevel();
        rule = new Rule();
        rule.loadLevel(level.getLevel(), level.getIcTotal());
//        testGameField.setText(rule.toString());
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            rule.walk(4);
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            rule.walk(6);
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            rule.walk(2);
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            rule.walk(8);
        }
//            rule.walk(dir);
//            testGameField.setText(rule.toString());

    }

    @Override
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image[][] i = rule.getImages();
        for (int j = 0; j < 11; j++) {
            for (int k = 0; k < 11; k++) {
                g.drawImage(i[j][k], j * 50, k * 50, null);
            }
        }
        g.drawImage(pika, 570, 10, null);
        g.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        g.drawString("Available pokeball: ", 580, 155);
        g.setColor(Color.RED);
        g.setFont(new Font (Font.DIALOG_INPUT, Font.BOLD, 70));
        g.drawString(level.getIcTotal()+"", 620, 205);
        repaint();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Pika! Challenge");
        frame.setContentPane(new PikaPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
