package com.ipartek.formacion.service;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheServiceImp implements CocheService {

	List<Coche> coches;

	public CocheServiceImp() {
		coches = new ArrayList<Coche>();
		init();

	}

	private void init() {
		Coche coche = new Coche();
		coche.setCodigo(0);
		coche.setNombre("primero");
		coches.add(coche.getCodigo(), coche);

		coche = new Coche();
		coche.setCodigo(1);
		coche.setNombre("segundo");
		coches.add(coche.getCodigo(), coche);

		coche = new Coche();
		coche.setCodigo(2);
		coche.setNombre("tercero");
		coches.add(coche.getCodigo(), coche);

	}

	public List<Coche> getAll() {

		return coches;
	}

	public Coche getById(Integer codigo) {

		return coches.get(codigo);
	}

}
