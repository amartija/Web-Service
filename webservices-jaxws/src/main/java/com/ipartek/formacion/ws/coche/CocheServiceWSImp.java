package com.ipartek.formacion.ws.coche;

import java.util.List;

import javax.jws.WebService;

import com.ipartek.formacion.pojo.Coche;
import com.ipartek.formacion.service.CocheService;
import com.ipartek.formacion.service.CocheServiceImp;

@WebService(serviceName = "cocheservice", wsdlLocation = "Cocheservice.wsdl", endpointInterface = "com.ipartek.formacion.ws.coche.CocheServiceWS")
public class CocheServiceWSImp implements CocheServiceWS {

	CocheService cs = new CocheServiceImp();
	List<Coche> coches;

	public CocheColeccion getAll() {

		CocheColeccion listaCoches = new CocheColeccion();
		List<Coche> coches;
		coches = cs.getAll();
		listaCoches.setCoches(coches);

		return listaCoches;
	}

	public Coche getById(Integer codigo) {
		Coche coche = new Coche();

		if (codigo != null) {

			coche = cs.getById(codigo);
		}
		return coche;
	}

}
