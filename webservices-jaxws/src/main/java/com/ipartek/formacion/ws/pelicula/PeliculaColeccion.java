package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;
import java.util.Set;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaColeccion implements Serializable {

	private Set<Pelicula> peliculas;
	private String mensaje;

	public PeliculaColeccion() {
		super();

		this.mensaje = "";
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return super.toString();
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Set<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Set<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}
