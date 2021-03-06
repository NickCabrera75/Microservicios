package com.distribuidos.microservicio.app.cursos.services;


import com.distribuidos.microservicio.app.cursos.models.entity.Curso;
import com.distribuidos.microservicio.commons.services.CommonService;

public interface CursoService extends CommonService<Curso> {

	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId);
}
