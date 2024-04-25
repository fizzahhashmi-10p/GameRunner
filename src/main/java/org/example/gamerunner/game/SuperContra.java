package org.example.gamerunner.game;


import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GameConsole{
    public void up(){
        System.out.println("Up");
    }

    public void down(){
        System.out.println("Sit Down");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Shoot Bullets");
    }
}
