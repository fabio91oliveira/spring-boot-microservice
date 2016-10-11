package br.com.devdata.workando.repository;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.devdata.workando.model.Vaga;


@Repository
public interface VagaRepository extends PagingAndSortingRepository<Vaga, Serializable>{

}
