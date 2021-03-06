package com.distribuidos.microservicio.app.cursos.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidos.microservicio.app.cursos.clients.RespuestaFeignClient;
import com.distribuidos.microservicio.app.cursos.models.entity.Curso;
import com.distribuidos.microservicio.app.cursos.models.repository.CursoRepository;
import com.distribuidos.microservicio.commons.services.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CursoService {

	@Autowired
	private RespuestaFeignClient client;
	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {
		return repository.findCursoByAlumnoId(id);
	}

	@Override
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId) {
		
		return client.obtenerExamenesIdsConRespuestasAlumno(alumnoId);
	}


}
