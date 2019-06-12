package com.villaverde.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.villaverde.models.Solicitud;

@Repository
public class SolicitudRepository {

		private static final Logger logger = LoggerFactory.getLogger(SolicitudRepository.class);
		
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		public List<Solicitud> listar() {
			logger.info("call listar()");
			
			String sql = "select * from productos";
			
			List<Solicitud> solicitudes = jdbcTemplate.query(sql, new RowMapper<Solicitud>() {
				
				@Override
				public Solicitud mapRow(ResultSet rs, int rowNum) throws SQLException{
					Solicitud solicitud = new Solicitud();
					solicitud.setEmail(rs.getString("email"));
					solicitud.setImagen(rs.getString("imagen"));
					solicitud.setMensaje(rs.getString("detalles"));
					solicitud.setSolicitud(rs.getString("solicitud"));
					
					return solicitud;
				}
				
				
			});
			
			logger.info("solicitud: " + solicitudes);
			
			return solicitudes;
}
}
