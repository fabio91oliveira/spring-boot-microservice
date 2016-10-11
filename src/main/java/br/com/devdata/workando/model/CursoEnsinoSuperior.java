package br.com.devdata.workando.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * Classe referente a Entidade de Dominio CursoEnsinoSuperior
 * 
 * @author fabio.oliveira
 *
 */
@Entity
public class CursoEnsinoSuperior {

	@Id
	private Long id;

	@NotNull
	private String nome;

	@OneToOne
	@NotNull
	private Universidade univerdade;

	@OneToOne
	@NotNull
	private TipoEnsino tipo;

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

	public Universidade getUniverdade() {
		return univerdade;
	}

	public void setUniverdade(Universidade univerdade) {
		this.univerdade = univerdade;
	}

	public TipoEnsino getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnsino tipo) {
		this.tipo = tipo;
	}

}
