package br.com.projectservices.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectservices.interfaces.IEstadoService;
import br.com.projectservices.model.Estado;
import br.com.projectservices.repositories.EstadoRepository;

@Service
public class EstadoService implements IEstadoService {
	
	@Autowired
	private EstadoRepository estadoRepo;

	@Override
	public Optional<Estado> buscarEstadoByUf(String uf) {
		return Optional.ofNullable(this.estadoRepo.findEstadoByUf(uf));
	}
	
	

}
