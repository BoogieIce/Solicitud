package com.villaverde.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.villaverde.models.Solicitud;
import com.villaverde.repositories.SolicitudRepository;


@Service
public class SolicitudService {

		@Autowired
	private SolicitudRepository solicitudoRepository;
	
	public List<Solicitud> listar() {
		return solicitudoRepository.listar();
}
}
