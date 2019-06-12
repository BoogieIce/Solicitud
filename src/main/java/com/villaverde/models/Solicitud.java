package com.villaverde.models;

import antlr.collections.List;

public class Solicitud {

	private String email;
	
	private String solicitud;
	
	private String mensaje;
	
	private String imagen;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Solicitud [email=" + email + ", solicitud=" + solicitud + ", mensaje=" + mensaje + ", imagen=" + imagen
				+ "]";
	}
	
}
