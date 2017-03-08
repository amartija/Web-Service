package com.ipartek.formacion.service;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheServiceImp implements CocheService{
	
	
	List<Coche> coches;
	
	public CocheServiceImp(){
		super();
		coches = new ArrayList<Coche>();
	
		
	}
	

	@Override
	public List<Coche> getAll() {
		
		return coches;
	}

	@Override
	public Coche getById(Integer codigo) {
		
		return coches.get(codigo);
	}

}
