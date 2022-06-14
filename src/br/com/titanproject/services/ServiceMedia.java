package br.com.titanproject.services;



import br.com.titanproject.entities.Aluno;

public class ServiceMedia {
   
	private Aluno aluno;
	
	public ServiceMedia(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String passouOuNao(){          
		Double mediaFinal = this.aluno.getNotas().stream().mapToDouble(n -> n).average().getAsDouble();

		if(mediaFinal < 5) 
		return String.format("Aluno: %s - Media %.2f ESTA : %s",this.aluno.getName(),mediaFinal, "REPROVADO");
	
		return String.format("Aluno: %s - Media %.2f ESTA : %s", this.aluno.getName(),mediaFinal, 
				                                            (mediaFinal >= 7 ) ? "APROVADO" : "RECUPERACAO" );
	}
	

}
