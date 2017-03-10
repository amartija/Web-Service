package com.ipartek.formacion.ws.pelicula;

import java.io.Serializable;
import java.util.List;

import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaColeccion implements Serializable {

	private List<Pelicula> peliculas;

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

}
