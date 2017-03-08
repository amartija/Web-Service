package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public interface AlumnoService {

	public List<Alumno> getAll();
	
	public Alumno getById(Integer codigo);
}
