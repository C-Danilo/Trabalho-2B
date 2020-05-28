package br.fepi.si.financeiro.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "maratona")
public class Maratona extends Evento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Maratona(String nomeEvento, Double distancia, Date data, Double tempoProva) {
		super(nomeEvento, distancia, data, tempoProva);
		
	}
	
	public Maratona() {
		
	}

}
