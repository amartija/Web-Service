package com.ipartek.formacion.ws;

import java.io.Serializable;
import java.util.List;

import com.ipartek.formacion.pojo.Alumno;

public class AlumnoColeccion implements Serializable{

	private List<Alumno> alumnos;

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	
}
