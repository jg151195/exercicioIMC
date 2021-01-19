package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa() {
	}

	public Pessoa(String nome, int idade, double altura, double peso) {

		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String imprimir() {
		
		return nome+
				" "+
				peso+
				"kg "+
				idade +
				" anos"+
				" "+
				altura +
				" "+
				"IMC: "+
				imc();
	}
	
	public String imc() {
		
		double imc = peso/(altura*altura);
		
		if(imc <= 18.5) {
			return String.format("%.2f", imc) +" Abaixo do peso" ;
		}
		else if(imc >= 18.6 && imc <= 24.9) {
			return String.format("%.2f", imc) + " Peso ideal (parabéns)";
		}
		else if(imc >= 25.0 && imc <= 29.9) {
			return String.format(".2f", imc) +" Levemente acima do peso";
		}
		else if(imc >= 30 && imc <= 34.9) {
			return String.format("%.2f", imc) +" Obesidade grau I";
		}
		else if(imc >= 35.0 && imc <= 39.9) {
			return String.format("%.2f", imc) +" Obesidade grau II (severa)";
		}
		else if(imc >= 40.0) {
			return String.format("%.2f", imc) +" Obesidade grau III (mórbida)";
		}
		return null;
	
	}
	
	
	

}
