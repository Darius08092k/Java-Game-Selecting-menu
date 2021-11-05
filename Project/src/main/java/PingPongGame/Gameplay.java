package PingPongGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Gameplay extends JPanel implements Runnable {

    JLabel gameOver = new JLabel("Game Over");
    static final int width = 800;
    static final int height = 800;
    static final Dimension Size = new Dimension(width,height);
    static final int widthBall = 20;
    static final int heightBall = 20;
    static final int widthPlayer = 100;
    static final int heightPlayer = 25;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Player player1;
    Player player2;
    Player player3;
    Ball bally;

    Gameplay(){

        playerNew();
        ballNew();
        this.setFocusable(true);
        this.addKeyListener(new ActionListener());
        this.setPreferredSize(Size);
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void stop(){
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ballNew(){
        //random  = new Random();
        bally = new Ball((width/2)-(widthBall/2),(height/2)-(heightBall/2),widthBall,heightBall);
    }
    public void playerNew(){

        player1 = new Player((width/2)-(widthPlayer/2)+20,0,widthPlayer,heightPlayer,1);
        player2 = new Player((width/2)-(widthPlayer/2)+20,height-heightPlayer,widthPlayer,heightPlayer,2);

    }
    public void paint(Graphics g){
        image = createImage(getWidth(),getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image,0,0,this);
    }
    public void draw (Graphics g){

        player1.draw(g);
        player2.draw(g);
        bally.draw(g);
        bally.move();

    }
    public void move(){

    }
    public void checkCollision(){

        if(bally.x <0){
            bally.setXDirection(-bally.xLocation);
        }
        if(bally.x > width-widthBall){
            bally.setXDirection(-bally.xLocation);
        }
        if(bally.y <0){
            System.out.println("Game Over");
          /*  gameOver.setBackground(Color.white);
            this.add(gameOver);*/
            stop();
        }
        if(bally.y >height-heightBall){
            System.out.println("Game Over");
           /* gameOver.setBackground(Color.white);
            this.add(gameOver);*/
            stop();
        }


        if(bally.intersects(player1)){
            bally.yLocation = Math.abs(bally.yLocation);
            bally.yLocation++;
            if(bally.xLocation>0) {
                bally.xLocation++;
            }
            else {
                bally.xLocation--;
            }
            bally.setYDirection(bally.yLocation);
            bally.setXDirection(bally.xLocation);
        }
        if(bally.intersects(player2)){
            bally.yLocation = Math.abs(bally.yLocation);
            bally.yLocation++;
            if(bally.xLocation>0) {
                bally.xLocation++;
            }
            else {
                bally.xLocation--;
            }
            bally.setYDirection(-bally.yLocation);
            bally.setXDirection(bally.xLocation);
        }


        if(player1.x <= 0 ){
            player1.x=0;
        }
        if(player1.x >= (width-widthPlayer)){
            player1.x = width-widthPlayer;
        }
        if(player2.x <= 0 ){
            player2.x=0;
        }
        if(player2.x >= (width-widthPlayer)){
            player2.x = width-widthPlayer;
        }

    }
    public void run(){
        //game loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(true){

            long now = System.nanoTime();
            delta += (now -lastTime)/ns;
            lastTime = now;
            if(delta >= 1){
                //move();
                checkCollision();
                repaint();
                delta--;
            }
        }
    }

    public class ActionListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {

            player1.keyPressed(e);
            player2.keyPressed(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {

            player1.keyReleased(e);
            player2.keyReleased(e);

        }
    }

}
