package br.com.e2etreinamentos.banke2etreinamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.e2etreinamentos.banke2etreinamentos.model.ContaDeCliente;

@Repository
public interface ContaDeClienteRepository  extends JpaRepository<ContaDeCliente,Long>{

}
