/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engine;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author i13067
 */
public class LoadImage extends JPanel{
    public static final int CANVAS_WIDTH = 640;
    public static final int CANVAS_HEIGHT = 480;
    //jangan lupa masukin gambar di folder src/img!!!
    private BufferedImage img;
      
public Image loadImageData(String imgFileName) {
        URL imgUrl = getClass().getClassLoader().getResource(imgFileName);
        if (imgUrl == null) {
            System.out.println("Couldn't find file: " + imgFileName);
        } else {
            try {
                img = ImageIO.read(imgUrl);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
    return img;
    }
}
