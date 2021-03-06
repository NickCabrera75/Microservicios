package com.distribuidos.microservicio.app.examenes.services;

import java.util.List;

import com.distribuidos.microservicio.commons.services.CommonService;
import com.distribuidos.microservicio.commonsexamenes.models.entity.Asignatura;
import com.distribuidos.microservicio.commonsexamenes.models.entity.Examen;

public interface ExamenService  extends CommonService<Examen>{
	
	public List<Examen> findByNombre(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();
}