package br.com.projectservices.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projectservices.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	@Transactional(readOnly = true)
	Cidade findCidadeById(Long id);

}
