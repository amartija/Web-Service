package com.ipartek.formacion.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ipartek.formacion.pojo.Coche;

@WebService(targetNamespace = "hhtp://com.ipartek.formacion/types", name = "cochews")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface CocheServiceWS {

	@WebMethod(operationName = "obtenerTodos")
	public CocheColeccion getAll();

	@WebMethod(operationName = "obtenerCocheporCodigo")
	public Coche getById(Integer codigo);

}