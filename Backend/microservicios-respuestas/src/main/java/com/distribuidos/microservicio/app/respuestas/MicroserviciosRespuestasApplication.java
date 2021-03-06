package com.distribuidos.microservicio.app.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.distribuidos.microservicio.app.respuestas.models.entity",
	"com.distribuidos.microservicio.commons.alumnos.models.entity",
	"com.distribuidos.microservicio.commonsexamenes.models.entity"})
public class MicroserviciosRespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosRespuestasApplication.class, args);
	}

}
