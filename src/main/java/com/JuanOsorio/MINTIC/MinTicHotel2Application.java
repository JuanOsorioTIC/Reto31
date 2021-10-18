package com.JuanOsorio.MINTIC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.JuanOsorio.MINTIC.model"})
@SpringBootApplication
public class MinTicHotel2Application {

	public static void main(String[] args) {
		SpringApplication.run(MinTicHotel2Application.class, args);
	}

}
