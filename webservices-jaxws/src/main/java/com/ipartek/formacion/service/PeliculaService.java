package com.ipartek.formacion.service;

import java.util.Set;

import com.ipartek.formacion.pojo.Pelicula;

public interface PeliculaService {

	public Pelicula getById(long codigo);

	public Set<Pelicula> getAll();
}
