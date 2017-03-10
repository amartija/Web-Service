package com.ipartek.formacion.ws.coche;

import java.io.Serializable;
import java.util.List;

import com.ipartek.formacion.pojo.Coche;

public class CocheColeccion implements Serializable{

	private List<Coche> coches;

	public List<Coche> getCoches() {
		return coches;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}

	
	
}
