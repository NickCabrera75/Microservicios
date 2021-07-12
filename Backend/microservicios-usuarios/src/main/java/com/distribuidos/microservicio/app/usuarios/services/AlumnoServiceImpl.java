package com.distribuidos.microservicio.app.usuarios.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidos.microservicio.app.usuarios.repository.AlumnoRepository;
import com.distribuidos.microservicio.commons.alumnos.models.entity.Alumno;
import com.distribuidos.microservicio.commons.services.CommonServiceImpl;

@Service

public class AlumnoServiceImpl extends CommonServiceImpl<Alumno,AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		return repository.findByNombreOrApellido(term);
	}

	
}
