package org.example.gamerunner.game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run(){
        System.out.println("Running Game: "+game);
        game.up();
        game.right();
        game.down();
        game.left();
    }
}
