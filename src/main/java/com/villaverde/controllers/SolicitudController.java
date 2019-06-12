package com.villaverde.controllers;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.villaverde.models.Solicitud;
import com.villaverde.services.SolicitudService;



@RestController
public class SolicitudController {
	
private static final Logger logger = LoggerFactory.getLogger(SolicitudController.class);
	
	@Autowired
	private SolicitudService solicitudService;
	
	@GetMapping("/solicitudes")
	public List<Solicitud> solicitudes(){
		
		logger.info("call solicitudes()");
		
		List<Solicitud> solicitudes = solicitudService.listar();
		logger.info("productos: " + solicitudes);
		
		return solicitudes;
	}
}
