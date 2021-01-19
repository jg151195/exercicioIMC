package entities;

public class Aluno {
	
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	
	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, double nota1, double nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double Media() {
		
		return (nota1*2+nota2*1)/3;
	}
	
	public String resultado() {
		
		if(Media() < 4.0) {
			return "Reprovado";
		}
		else if(Media() >= 4.0 && Media() < 6) {
			return "Recuperação";
		}
		else if(Media() >= 6.0) {
			return "Aprovado";
		}
		return null;

	}
	
	public String imprimir() {
		
		return matricula +
				" "+
				nome +
				" "+
				nota1 +
				" "+
				nota2 +
				" "+
				String.format("%.2f", Media()) +
				" "+
				resultado();
	}
	
}
