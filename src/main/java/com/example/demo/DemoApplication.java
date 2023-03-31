package com.example.demo;

import com.example.demo.Repository.FlightRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Flight;
import com.example.demo.entity.User;
import com.example.demo.entity.User_type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, FlightRepository flightRepository) {
		return args -> {

			User user = User.builder().username("Cristi2001").password("parolaCristi").name("Cristea Cristian").type(User_type.ADMIN).build();
			userRepository.save(user);
			Flight flight = Flight.builder().date_time(LocalDateTime.of(2023, 4, 21, 14, 30)).nr_seats(360).number("RO4356").build();
			flightRepository.save(flight);
		};
	}

}
