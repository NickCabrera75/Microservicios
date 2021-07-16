package com.distribuidos.microservicio.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidos.microservicio.app.examenes.models.repository.AsignaturaRepository;
import com.distribuidos.microservicio.app.examenes.models.repository.ExamenRepository;
import com.distribuidos.microservicio.commons.services.CommonServiceImpl;
import com.distribuidos.microservicio.commonsexamenes.models.entity.Asignatura;
import com.distribuidos.microservicio.commonsexamenes.models.entity.Examen;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService {

	@Autowired
	private AsignaturaRepository  asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByNombre(String term) {
		return repository.findByNombre(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}


}
