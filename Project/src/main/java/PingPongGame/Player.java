package PingPongGame;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Rectangle{

    int id;
    int xLocation;
    int speed = 10;

    Player(int x, int y, int widthPlayer, int heightPlayer, int id){

        super(x,y,widthPlayer,heightPlayer);
        this.id = id;

    }
    public void keyPressed(KeyEvent e) {

        if(id==1){
            if(e.getKeyCode()==KeyEvent.VK_A){
                setXDirection(-speed);
                move();
            }
            if(e.getKeyCode()==KeyEvent.VK_D){
                setXDirection(speed);
                move();
            }
        }
        if(id==2){
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                setXDirection(-speed);
                move();
            }
            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                setXDirection(speed);
                move();
            }
        }

    }
    public void keyReleased(KeyEvent e) {
        if(id==1){
            if(e.getKeyCode()==KeyEvent.VK_A){
                setXDirection(0);
                move();
            }
            if(e.getKeyCode()==KeyEvent.VK_D){
                setXDirection(0);
                move();
            }
        }
        if(id==2){
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                setXDirection(0);
                move();
            }
            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                setXDirection(0);
                move();
            }
        }
    }
    public void setXDirection(int xDirection){

        xLocation = xDirection;

    }
    public void move(){
        x = x + xLocation;

    }
    public void draw (Graphics g){

        if(id==1){
            g.setColor(Color.BLUE);
        }
        if(id==2){
            g.setColor(Color.red);
        }
        g.fillRect(x,y,width,height);

    }

}
