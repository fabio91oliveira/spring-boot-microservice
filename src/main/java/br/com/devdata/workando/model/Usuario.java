package br.com.devdata.workando.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Classe referente a Entidade Usuario
 * 
 * @author fabio.oliveira
 *
 */
@Entity
public class Usuario {

	@Id
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String email;

	@NotNull
	private String senha;

	@NotNull
	@OneToOne
	private Curriculo curriculo;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Curriculo getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

}
