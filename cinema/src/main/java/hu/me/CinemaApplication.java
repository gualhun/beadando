package hu.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}
}


//http://localhost:8181/h2-console/
//postman adat felvitel:
//{
//	"title": "Star Trek",
//	"genre": "Sc-Fi"
//}

