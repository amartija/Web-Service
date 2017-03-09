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

import com.ipartek.formacion.pojo.Alumno;

@WebService(targetNamespace= "", name ="")
@SOAPBinding(style= Style.RPC, use = Use.LITERAL)
public interface AlumnoServiceWS {

	@WebMethod
	@ResponseWrapper(targetNamespace= "",className="com.ipartek.formacion.ws.AlumnoColeccion")
	public AlumnoColeccion getAll();
	
	@WebMethod
	@ResponseWrapper(targetNamespace = "", className= "com.ipartek.formacion.pojo.Alumno")
	@RequestWrapper()
	public Alumno getById (@WebParam(targetNamespace="", mode = Mode.IN, name="alumnocodigo")Integer codigo);
	
}
