package org.example.gamerunner;

import org.example.gamerunner.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@ComponentScan("org.example.gamerunner.game")
public class GameRunnerApplication {

	public static void main(String[] args) {

		try(var context =
					new AnnotationConfigApplicationContext(
							GameRunnerApplication.class))
		{
		context.getBean(GameConsole.class).up();
		context.getBean(GameRunner.class).run();
		}




//		SpringApplication.run(GameRunnerApplication.class, args);

	}

}
