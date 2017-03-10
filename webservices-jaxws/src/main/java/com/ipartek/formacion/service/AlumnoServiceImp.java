package com.ipartek.formacion.service;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoServiceImp implements AlumnoService {

	List<Alumno> alumnos;

	public AlumnoServiceImp() {
		alumnos = new ArrayList<Alumno>();
		init();

	}

	private void init() {
		Alumno alumno = new Alumno();
		alumno.setCodigo(0);
		alumno.setNombre("primero");
		alumno.setApellidos("primero apellidos");
		alumnos.add(alumno.getCodigo(), alumno);

		alumno = new Alumno();
		alumno.setCodigo(1);
		alumno.setNombre("segundo");
		alumno.setApellidos("segundo apellidos");
		alumnos.add(alumno.getCodigo(), alumno);

		alumno = new Alumno();
		alumno.setCodigo(2);
		alumno.setNombre("tercero");
		alumno.setApellidos("tercero apellidos");
		alumnos.add(alumno.getCodigo(), alumno);

	}

	public List<Alumno> getAll() {

		return alumnos;
	}

	public Alumno getById(Integer codigo) {

		return alumnos.get(codigo);
	}

}
