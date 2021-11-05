package PingPongGame;

import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;
    int xLocation;
    int yLocation;

    Ball(int x, int y, int width, int height){

        super(x,y,width,height);
        random = new Random();
        int randomDirectionX = random.nextInt(2);
        if(randomDirectionX == 0){
            randomDirectionX--;
        }
        setXDirection(randomDirectionX);
        int randomDirectionY = random.nextInt(2);
        if(randomDirectionY == 0){
            randomDirectionY--;
        }
        setYDirection(randomDirectionY);
    }
    public void setXDirection(int randomDirectionX){
        xLocation = randomDirectionX;
    }
    public void setYDirection(int randomDirectionY){
        yLocation = randomDirectionY;
    }
    public void move(){
        x = x + xLocation;
        y = y + yLocation;
    }
    public void draw (Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(x,y,width,height);
    }
}
