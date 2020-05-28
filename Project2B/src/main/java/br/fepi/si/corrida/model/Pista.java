package br.fepi.si.corrida.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "maratona")
public class Pista extends Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int nVoltas;
	
	public Pista(String nomeEvento, Double distancia, Date data, Double tempoProva) {
		super(nomeEvento, distancia, data, tempoProva);
		this.nVoltas = nVoltas;
	}
	
	
	public Pista() {
		
	}
	
	@Column(name = "Numero_voltas", nullable = false)
	public int getnVoltas() {
		return nVoltas;
	}

	public void setnVoltas(int nVoltas) {
		this.nVoltas = nVoltas;
	}



}
