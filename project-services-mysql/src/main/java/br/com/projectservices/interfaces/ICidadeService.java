package br.com.projectservices.interfaces;

import br.com.projectservices.model.Cidade;

public interface ICidadeService {
	
	/**
	 * Retorna uma cidade dado o id.
	 * @param id
	 * @return Cidade
	 */
	Cidade getCidadeById(Long id);

}
