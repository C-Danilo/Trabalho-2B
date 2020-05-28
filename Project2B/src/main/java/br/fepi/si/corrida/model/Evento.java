package br.fepi.si.corrida.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity // ManagedBean
@Table(name = "eventos") // ManagedBean
public abstract class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeEvento;
	private double distancia;
	private Date data;
	private double tempoProva;
	
	public Evento(String nomeEvento, Double distancia, Date data, Double tempoProva) {
		super();
		this.nomeEvento = nomeEvento;
		this.distancia = distancia;
		this.data = data;
		this.tempoProva = tempoProva;
	}
	
	public Evento() {
	}

	@NotEmpty // BeanValidation
	@Size(max = 60) // BeanValidation
	@Column(length = 40, nullable = false) // ManagedBean
	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setDescricao(String descricao) {
		this.nomeEvento = descricao;
	}

	@NotNull // BeanValidation
	@DecimalMin("0") // BeanValidation
	@Column(precision = 10, scale = 2, nullable = false) // ManagedBean
	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

	@NotNull // BeanValidation
	@Temporal(TemporalType.DATE) // ManagedBean
	@Column(name = "data_Evento", nullable = false) // ManagedBean
	public Date getData() {
		return data;
	}

	public void setData(Date dataVencimento) {
		this.data = dataVencimento;
	}

	@NotNull // BeanValidation
	@Column(name = "tempo_Prova", precision = 10, scale = 2, nullable = false) // ManagedBean
	public double getTempoProva() {
		return tempoProva;
	}

	public void setTempoProva(double tempoProva) {
		this.tempoProva = tempoProva;
	}

}
