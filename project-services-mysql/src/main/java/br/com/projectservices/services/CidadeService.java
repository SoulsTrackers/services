package br.com.projectservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projectservices.interfaces.ICidadeService;
import br.com.projectservices.model.Cidade;
import br.com.projectservices.repositories.CidadeRepository;

@Service
public class CidadeService implements ICidadeService{

	@Autowired
	private CidadeRepository cidadeRepo;
	
	
	@Override
	public Cidade getCidadeById(Long id) {
		return this.cidadeRepo.findCidadeById(id);
	}

	
	
}
