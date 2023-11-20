package Streaming;
public abstract class Seguidores {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	public String getNome() {
		return nome;
	}

	public Seguidores(String nome, int idade, String sexo, int experiencia) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return " " 
	+ nome 
	+ "\n Id: " + idade 
    + " Sexo: " + sexo 
	+ " Exp: " + experiencia + " ";
	}
		
}
	

