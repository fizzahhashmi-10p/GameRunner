package org.example.gamerunner;

import org.example.gamerunner.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class GameRunnerApplication {

	public static void main(String[] args) {

		try(var context =
					new AnnotationConfigApplicationContext(
							GammingConfiguration.class))
		{
		context.getBean(GameConsole.class).up();
		context.getBean(GameRunner.class).run();
		}




//		SpringApplication.run(GameRunnerApplication.class, args);

	}

}
