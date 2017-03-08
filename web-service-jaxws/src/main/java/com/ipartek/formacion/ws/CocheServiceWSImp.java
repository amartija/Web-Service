package com.ipartek.formacion.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.CocheService;
import com.ipartek.formacion.service.CocheServiceImp;

@WebService(endpointInterface = "")
public class CocheServiceWSImp implements CocheServiceWS{

	CocheService cs = new CocheServiceImp();
	List<Coche> coches;
	
	public CocheServiceWSImp(){
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
	@Override
	public CocheColeccion getAll() {
		
		CocheColeccion listaCoches = new CocheColeccion();
		List<Coche> coches;
		coches = cs.getAll();
		listaCoches.setCoches(coches);
		
		return listaCoches;
	}

	@Override
	public Coche getById(Integer codigo) {
		Coche coche = new Coche();
		
		if(codigo != null){
			
			coche = cs.getById(codigo);
		}
		return coche;
	}

}
