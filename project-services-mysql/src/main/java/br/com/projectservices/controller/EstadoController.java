package br.com.projectservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectservices.interfaces.IEstadoService;
import br.com.projectservices.model.Estado;

@RestController
@RequestMapping("/estado")
public class EstadoController {	
	
	@Autowired
	private IEstadoService estadoService;
	
	@GetMapping("estado/{uf}")
	public ResponseEntity<Optional<Estado>> getEstadoByUf(@PathVariable("id") String uf) {
		Optional<Estado> estado = estadoService.buscarEstadoByUf(uf);
		return new ResponseEntity<>(estado, HttpStatus.OK);
	}
	
	

}
