package com.ipartek.formacion.service;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoServiceImp implements AlumnoService {

	List<Alumno> alumnos;

	public AlumnoServiceImp() {
		super();
		alumnos = new ArrayList<Alumno>();

	}

	public List<Alumno> getAll() {

		return alumnos;
	}

	public Alumno getById(Integer codigo) {

		return alumnos.get(codigo);
	}

}
