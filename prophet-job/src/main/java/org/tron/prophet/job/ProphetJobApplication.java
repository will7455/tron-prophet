package org.tron.prophet.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProphetJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProphetJobApplication.class, args);
	}

}
