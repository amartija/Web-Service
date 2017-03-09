package com.ipartek.formacion.service;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.ipartek.formacion.pojo.Genero;
import com.ipartek.formacion.pojo.Pelicula;

public class PeliculaServiceImp implements PeliculaService {

	Set<Pelicula> peliculas;

	public PeliculaServiceImp() {
		peliculas = new TreeSet<Pelicula>();
		init();
	}

	private void init() {
		Genero genero = new Genero();
		genero.setNombre("Drama");

		Pelicula pelicula = new Pelicula();
		pelicula.setCodigo(1);
		pelicula.setTitulo("Padrino");
		pelicula.setGenero(genero);
		pelicula.setfEstreno(new Date());

		peliculas.add(pelicula);

		genero = new Genero();
		genero.setNombre("Accion");

		pelicula = new Pelicula();
		pelicula.setCodigo(2);
		pelicula.setTitulo("Kill Bill");
		pelicula.setfEstreno(new Date());
		pelicula.setGenero(genero);

		peliculas.add(pelicula);

		genero = new Genero();
		genero.setNombre("Ciencia Ficcion");

		pelicula = new Pelicula();
		pelicula.setCodigo(3);
		pelicula.setTitulo("Star Wars");
		pelicula.setfEstreno(new Date());
		pelicula.setGenero(genero);

		peliculas.add(pelicula);

	}

	@Override
	public Pelicula getById(long codigo) {
		Pelicula pelicula = encontrarPorCodigo(codigo);
		return pelicula;
	}

	private Pelicula encontrarPorCodigo(long codigo) {
		boolean encontrar = false;
		Pelicula pelicula = null;
		int i = 0, len = peliculas.size();

		Iterator<Pelicula> it = peliculas.iterator();

		while (it.hasNext() && encontrar == false) {

			Pelicula aux = it.next();
			if (aux.getCodigo() == codigo) {
				encontrar = true;
				pelicula = aux;

			}
		}

		return pelicula;
	}

	@Override
	public Set<Pelicula> getAll() {

		return peliculas;
	}

}
