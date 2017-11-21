package main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Game extends JPanel implements Runnable {

    private boolean running;
    private BufferedImage image;
    private Graphics2D g;

    //Constructor
    public Game(){
        init();
    }

    public void init(){
        //Sets game to run
        running = true;
        //Initializes the rendering window
        image = new BufferedImage(main.WIDTH, main.HEIGHT, BufferedImage.TYPE_INT_RGB);
        //Tells the graphical renderer where to render
        g = (Graphics2D) image.getGraphics();
    }

    @Override
    public void run() {
        //Game loop

        while(running){
            //Update
            update();

            //Render
            render();

            //Display
            //Extended from JPanel
            repaint();
        }
    }

    public void update(){

    }

    public void render(){

    }

    //
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        //Draw
        g2.drawImage(image, 0,0,main.WIDTH,main.HEIGHT, null);
        //Clear
        g2.dispose();
    }
}