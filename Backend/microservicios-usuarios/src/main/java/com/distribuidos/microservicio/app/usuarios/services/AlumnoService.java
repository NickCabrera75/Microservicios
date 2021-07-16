package com.distribuidos.microservicio.app.usuarios.services;

import java.util.List;

import com.distribuidos.microservicio.commons.alumnos.models.entity.Alumno;
import com.distribuidos.microservicio.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNombreOrApellido(String term);
}
