package org.example.gamerunner;

import org.example.gamerunner.game.GameConsole;
import org.example.gamerunner.game.GameRunner;
import org.example.gamerunner.game.PackMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GammingConfiguration {

    @Bean
    public GameConsole game(){
        return new PackMan();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

    //		var game = new MarioGame();
    //		var game = new SuperContra();
//    var game = new PackMan();
//    var gameRunner = new GameRunner(game);
//		gameRunner.run();
}
