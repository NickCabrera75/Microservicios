package com.distribuidos.microservicio.app.respuestas.services;

import com.distribuidos.microservicio.app.respuestas.models.entity.Respuesta;

public interface RespuestasService {

	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
	
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId);
	
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);
}
