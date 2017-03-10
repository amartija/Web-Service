package com.ipartek.formacion.ws.pelicula;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.ipartek.formacion.pojo.Pelicula;
import com.ipartek.formacion.service.PeliculaService;
import com.ipartek.formacion.service.PeliculaServiceImp;

@WebService(serviceName = "peliculasservice", portName = "", targetNamespace = "http://com.ipartek.formacion/types")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public class PeliculaServiceWSImp {
	// recoger estructura comunicacion
	@Resource
	WebServiceContext wsc;

	@WebMethod(operationName = "obtenerporid")
	public PeliculaMensaje getById(long codigo) {
		PeliculaMensaje pm = new PeliculaMensaje();

		if (validarPeticion()) {

			PeliculaService ps = new PeliculaServiceImp();
			Pelicula pelicula = ps.getById(codigo);

			if (pelicula == null) {

				pm.setMensaje("El codigo enviado no corresponde a ninguna pelicula " + codigo);
			} else {

				pm.setPelicula(pelicula);

			}
		} else {

			pm.setMensaje("La contraseña enviada no es correcta");
		}
		return pm;

	}

	private boolean validarPeticion() {
		boolean valida = false;
		// WS Security
		MessageContext contextoMensaje = wsc.getMessageContext();
		Map<?, ?> encabezados = (Map<?, ?>) contextoMensaje.get(MessageContext.HTTP_REQUEST_HEADERS);

		// el nombre del atributo de "encabezados" se llama asi porque asi se
		// decide
		// es una lista porque lo decidimos asi
		List<?> listaparametros = (List<?>) encabezados.get("sessionId");
		// cogemos un identificador
		String sessionId = "ipsession";

		if (listaparametros != null) {
			// Aqui hariamos o produciriamos cualquier validacion compleja
			if (sessionId.equals(listaparametros.get(0).toString())) {

				valida = true;

			}

		}

		return valida;

	}

	@WebMethod(operationName = "obtenerListado")
	public PeliculaColeccion getAll() {
		PeliculaService ps = new PeliculaServiceImp();
		PeliculaColeccion listaPeliculas = new PeliculaColeccion();
		List<Pelicula> peliculas;

		peliculas = (List<Pelicula>) ps.getAll();

		listaPeliculas.setPeliculas(peliculas);

		return listaPeliculas;

	}

}
