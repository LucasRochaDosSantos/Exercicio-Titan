package br.com.titanproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.titanproject.entities.Aluno;
import br.com.titanproject.services.ServiceMedia;

public class ApplicationMediaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Bem Vindo !!!");
		System.out.println("Sistema Basico Média Aritmética");
		System.out.println("=====  =====  =====  ===== ===== ");
		
		System.out.printf("\nPof Favor Informe o Nome Do Aluno: ");
		String nomeDoAluno = entrada.nextLine();
	    
		System.out.printf("\nPof Favor Informe Numero Inteiro para "+
		                        " quantidade de notas a serem inseridas do Aluno !!! ");
	    
		Integer contador = entrada.nextInt();
		
		List<Double> notas = new ArrayList<>();
		
		for(int x = 0; x < contador; x++) {
			System.out.printf("\nPof Favor %d º nota: ", x+1);
			Double nota = entrada.nextDouble();
			notas.add(nota);
		}
		
		ServiceMedia serviceMedia = new ServiceMedia(new Aluno(nomeDoAluno, notas));
		System.out.println(serviceMedia.passouOuNao());
        
		entrada.close();
	}

		

}
