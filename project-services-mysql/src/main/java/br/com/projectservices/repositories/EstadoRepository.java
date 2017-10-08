package br.com.projectservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.projectservices.model.Estado;

//@NamedNativeQueries({
//	@NamedQuery(name = "EstadoRepository.buscarEstadoById", query = "s")
//})
public interface EstadoRepository extends JpaRepository<Estado, Long>{

	@Transactional(readOnly = true)
	Estado findEstadoByUf(String uf);


}
