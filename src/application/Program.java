package application;

import java.util.Locale;

import entities.Aluno;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Pessoa pessoa = new Pessoa("Jo�o", 25, 1.74, 67.0);
		
		System.out.println(pessoa.imprimir());
		
		System.out.println("-------------------------");
		
		Aluno aluno = new Aluno(10,"Jo�o", 9.0, 8.0);
		
		System.out.println(aluno.imprimir());
	}

}
