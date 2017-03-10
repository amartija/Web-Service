package com.ipartek.formacion.ws.alumno;

import java.util.List;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Alumno;
import com.ipartek.formacion.service.AlumnoService;
import com.ipartek.formacion.service.AlumnoServiceImp;

@WebService(serviceName = "alumnoservice", wsdlLocation = "Alumnoservice.wsdl", endpointInterface = "com.ipartek.formacion.ws.alumno.AlumnoServiceWS")
public class AlumnoServiceWSImp implements AlumnoServiceWS {

	AlumnoService as = new AlumnoServiceImp();
	List<Alumno> alumnos;

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
