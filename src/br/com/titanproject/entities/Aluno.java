package br.com.titanproject.entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String name;
	private List<Double> notas = new ArrayList<>();
    
	public Aluno() {}
	
	public Aluno(String name) {
		this.name = name;
	}
	
	public Aluno(String name, List<Double> notas) {
		this.name = name;
		this.notas = notas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Double> getNotas() {
		return notas;
	}


}
