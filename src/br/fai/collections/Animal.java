package br.fai.collections;

public abstract class Animal {

	public void som() {
		System.out.println("Este � o som padr�o de animal: zzzzz");
	}

	public void dizerMeuNome() {
		System.out.println("O nome do animal �: XXX");
	}

	private void dizerMinhaIdade() {
		System.out.println("Minha idade �: XXX");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

	private String cor = "preto";
	private int idade = 5;
	private String nome = "N�o definido";

}
