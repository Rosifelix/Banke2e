package br.com.e2etreinamentos.banke2etreinamentos.repository;

import org.springframework.stereotype.Repository;
import br.com.e2etreinamentos.banke2etreinamentos.model.ContaBanco;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ContaBancoRepository extends  JpaRepository<ContaBanco, Long> {

}
