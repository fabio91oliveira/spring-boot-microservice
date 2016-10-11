package br.com.devdata.workando.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * Classe referente a Entidade Vaga
 * 
 * @author fabio.oliveira
 *
 */
@Entity
public class Vaga {

	@Id
	@NotNull
	private Long id;

	@NotNull
	private String breveDescricao;

	@NotNull
	private String longaDescricao;

	@NotNull
	private BigDecimal baseSalarioMin;

	@Null
	private BigDecimal baseSalarioMax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBreveDescricao() {
		return breveDescricao;
	}

	public void setBreveDescricao(String breveDescricao) {
		this.breveDescricao = breveDescricao;
	}

	public String getLongaDescricao() {
		return longaDescricao;
	}

	public void setLongaDescricao(String longaDescricao) {
		this.longaDescricao = longaDescricao;
	}

	public BigDecimal getBaseSalarioMin() {
		return baseSalarioMin;
	}

	public void setBaseSalarioMin(BigDecimal baseSalarioMin) {
		this.baseSalarioMin = baseSalarioMin;
	}

	public BigDecimal getBaseSalarioMax() {
		return baseSalarioMax;
	}

	public void setBaseSalarioMax(BigDecimal baseSalarioMax) {
		this.baseSalarioMax = baseSalarioMax;
	}

}
