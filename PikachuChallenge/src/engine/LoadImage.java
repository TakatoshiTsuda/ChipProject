/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Kelas untuk me-load gambar ke dalam window/canvas
 * @author i13067
 */
public class LoadImage {

//    public static final int CANVAS_WIDTH = 640; //ukuran lebar window yang akan muncul
//    public static final int CANVAS_HEIGHT = 640; //ukuran tinggi window yang akan muncul 
    private BufferedImage img; //atribut buffered image untuk me-load gambar
    
    /**
     * Method untuk me-load gambar ke dalam window/canvas
     * @param imgFileName nama file image yang akan di-load
     * @return gambar yang telah di-load
     */
    public Image loadImageData(String imgFileName) {
        URL imgUrl = LoadImage.class.getClassLoader().getResource(imgFileName);
        if (imgUrl == null) {
            System.out.println("Couldn't find file: " + imgFileName);
        } else {
            try {
                img = ImageIO.read(imgUrl);
            } catch (IOException ex) {
            }
        }
//        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        return img;
    }
}
