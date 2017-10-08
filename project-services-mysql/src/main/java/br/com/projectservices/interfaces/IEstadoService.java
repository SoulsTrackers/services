package br.com.projectservices.interfaces;

import java.util.Optional;

import br.com.projectservices.model.Estado;

public interface IEstadoService {
	
	/**
	 * Retorna um estado dado a UF.
	 * @param id
	 * @return Estado
	 */
	Optional<Estado> buscarEstadoByUf(String uf);

}
