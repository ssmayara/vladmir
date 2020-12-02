package br.com.mayara.vladmir.repository;

import br.com.mayara.vladmir.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//entidade e tipo do id
@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Integer>{

}
