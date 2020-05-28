package br.fepi.si.corrida.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeradorTabelasApp {

	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		try {
			emf = Persistence.createEntityManagerFactory("ProjetoCorridaPU");
		} catch (Exception e) {
			System.out.println(e.getMessage().toUpperCase());
		} finally {
			emf.close();
		}

	}

}
