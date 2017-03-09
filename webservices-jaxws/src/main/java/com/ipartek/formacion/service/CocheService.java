package com.ipartek.formacion.service;

import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public interface CocheService {

	public List<Coche> getAll();
	
	public Coche getById(Integer codigo);
}
