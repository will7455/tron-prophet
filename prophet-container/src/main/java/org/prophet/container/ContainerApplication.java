package org.prophet.container;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.prophet")
@MapperScan(basePackages = {"org.prophet.dao.mappers"})
public class ContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerApplication.class, args);
	}

}
