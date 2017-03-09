package com.ipartek.formacion.pojo;

import java.io.Serializable;
import java.util.Date;

public class Pelicula implements Serializable, Comparable<Pelicula> {

	private int codigo;
	private String titulo;
	private Date fEstreno;
	private Genero genero;

	public Pelicula() {
		super();
		this.codigo = 00;
		this.titulo = "";
		this.fEstreno = null;
		this.genero = null;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getfEstreno() {
		return fEstreno;
	}

	public void setfEstreno(Date fEstreno) {
		this.fEstreno = fEstreno;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int compareTo(Pelicula o) {
		// compara por titulo y ordena. saca >0; =0;<0

		return this.titulo.compareToIgnoreCase(o.titulo);
	}

}
