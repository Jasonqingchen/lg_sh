package com.example.LqcSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@EnableCaching
//@MapperScan("com.example.LqcSpringBoot.mapper")
public class LqcSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LqcSpringBootApplication.class, args);
	}

}
