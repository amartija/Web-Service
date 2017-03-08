package com.ipartek.formacion.ws;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.ipartek.formacion.pojo.Coche;

@WebService(targetNamespace= "", name ="")
@SOAPBinding(style= Style.RPC, use = Use.LITERAL)
public interface CocheServiceWS {

	@WebMethod
	@ResponseWrapper(targetNamespace= "",className="com.ipartek.formacion.ws.CocheColeccion")
	public CocheColeccion getAll();
	
	@WebMethod
	@ResponseWrapper(targetNamespace = "", className= "com.ipartek.formacion.pojo.Coche")
	@RequestWrapper()
	public Coche getById (@WebParam(targetNamespace="", mode = Mode.IN, name="cochecodigo")Integer codigo);
	
}