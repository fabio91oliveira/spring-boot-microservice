package br.com.devdata.workando.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Classe referente a Entidade de Dominio Certificado
 * 
 * @author fabio.oliveira
 *
 */
@Entity
public class Certificado {

	@Id
	@NotNull
	private Long id;

	@NotNull
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
