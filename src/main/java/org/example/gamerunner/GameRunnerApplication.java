package org.example.gamerunner;

import org.example.gamerunner.game.GameRunner;
import org.example.gamerunner.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();



//		SpringApplication.run(GameRunnerApplication.class, args);

	}

}
