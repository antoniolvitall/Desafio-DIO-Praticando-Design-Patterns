package cne.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EnderecoRepository extends CrudRepository<Endereco, String> {
}
