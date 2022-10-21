package com.simplilearnproject.VirtualKey;
import com.simplilearnproject.VirtualKey.Screen.WelcomeScreen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class VirtualKeyApplication {

	public static void main(String[] args)  {
		SpringApplication.run(VirtualKeyApplication.class, args);
		WelcomeScreen welcome = new WelcomeScreen();
		welcome.introWS();
		welcome.GetUserInput();
	}

}
