package br.fepi.si.financeiro.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Corrida_Obstaculos")
public class Obstaculos extends Evento implements Serializable {

	private static final long serialVersionUID = 1L;

	private int qtObstaculos;

	public Obstaculos(String nomeEvento, Double distancia, Date data, Double tempoProva) {
		super(nomeEvento, distancia, data, tempoProva);
		this.qtObstaculos = qtObstaculos;
	}

	public Obstaculos() {

	}

	@Column(name = "Numero_Obstaculos", nullable = false)
	public int getnObstaculos() {
		return qtObstaculos;
	}

	public void setnObstaculos(int nObstaculos) {
		this.qtObstaculos = nObstaculos;
	}

}
