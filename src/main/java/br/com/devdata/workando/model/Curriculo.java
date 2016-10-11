package br.com.devdata.workando.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Classe referente a Entidade Curriculo
 * 
 * @author fabio.oliveira
 *
 */
@Entity
public class Curriculo {

	@Id
	private Long id;

	@NotNull
	private String apresentacaoPessoal;

	@NotNull
	private BigDecimal pretensaoMin;

	@Null
	private BigDecimal pretensaoMax;
	
	@NotNull
	@OneToMany
	private List<CursoEnsinoSuperior> ensinosSuperiores;

	@Null
	@OneToMany
	private List<Habilidade> habilidades;

	@Null
	@OneToMany
	private List<CursoLivre> cursosLivres;

	@Null
	@OneToMany
	private List<Certificado> certificados;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApresentacaoPessoal() {
		return apresentacaoPessoal;
	}

	public void setApresentacaoPessoal(String apresentacaoPessoal) {
		this.apresentacaoPessoal = apresentacaoPessoal;
	}

	public BigDecimal getPretensaoMin() {
		return pretensaoMin;
	}

	public void setPretensaoMin(BigDecimal pretensaoMin) {
		this.pretensaoMin = pretensaoMin;
	}

	public BigDecimal getPretensaoMax() {
		return pretensaoMax;
	}

	public void setPretensaoMax(BigDecimal pretensaoMax) {
		this.pretensaoMax = pretensaoMax;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public List<CursoLivre> getCursosLivres() {
		return cursosLivres;
	}

	public void setCursosLivres(List<CursoLivre> cursosLivres) {
		this.cursosLivres = cursosLivres;
	}

	public List<Certificado> getCertificados() {
		return certificados;
	}

	public void setCertificados(List<Certificado> certificados) {
		this.certificados = certificados;
	}

}
