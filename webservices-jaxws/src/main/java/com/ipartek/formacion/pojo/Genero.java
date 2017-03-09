package com.ipartek.formacion.pojo;

import java.io.Serializable;

public class Genero implements Serializable {

	private static final long codigo = 0;
	private String nombre;

	public Genero() {
		super();
		this.nombre = "comedia";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getCodigo() {
		return codigo;
	}

}
