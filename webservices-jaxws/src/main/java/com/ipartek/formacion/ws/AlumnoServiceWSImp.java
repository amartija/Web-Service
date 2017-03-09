package com.ipartek.formacion.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.AlumnoServiceImp;

@WebService(endpointInterface = "")
public class AlumnoServiceWSImp implements AlumnoServiceWS {

	AlumnoService as = new AlumnoServiceImp();
	List<Alumno> alumnos;

	public AlumnoServiceWSImp() {
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

	public AlumnoColeccion getAll() {

		AlumnoColeccion listaAlumno = new AlumnoColeccion();
		List<Alumno> alumnos;
		alumnos = as.getAll();
		listaAlumno.setAlumnos(alumnos);

		return listaAlumno;
	}

	public Alumno getById(Integer codigo) {
		Alumno alumno = new Alumno();

		if (codigo != null) {

			alumno = as.getById(codigo);
		}
		return alumno;
	}

}
