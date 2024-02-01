package com.example.relacionesjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelacionesjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelacionesjpaApplication.class, args);
		Carro carro = new Carro("Toyota" , 4, 20000, 0, 5); // base de datos

		CarroDTO carroDTO = new CarroDTO();
		carroDTO.setMarcaCarro(carro.getMarca());
		carroDTO.setNumeroAsientos(carro.getNumAsientos());
		carroDTO.setPrecioCarro(carro.getPrecio());
	}

}
