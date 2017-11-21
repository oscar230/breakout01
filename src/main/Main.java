package main;

import javax.swing.*;

public class Main {
    public static final int WIDTH = 1280, HEIGHT = 720;

    public static void main(String[] args){
        //Create program JFrame
        JFrame mainFrame = new JFrame("Den otroliga utbrytaren");

        //Create the game
        Game game = new Game();
        //Create a new thread for the game
        Thread gameThread = new Thread(game);

        //Initialize program JFrame
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        //Add the game to the JFrame
        mainFrame.add(game);
        //Start the thread running the game
        gameThread.start();
    }
}