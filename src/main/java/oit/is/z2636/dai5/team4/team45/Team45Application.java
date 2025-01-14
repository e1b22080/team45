package oit.is.z2636.dai5.team4.team45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Team45Application {

	public static void main(String[] args) {
		SpringApplication.run(Team45Application.class, args);
	}

}
