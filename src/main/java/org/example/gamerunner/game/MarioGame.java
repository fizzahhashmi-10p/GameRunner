package org.example.gamerunner.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class MarioGame implements GameConsole{
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go into hope");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Accelerate");
    }
}
