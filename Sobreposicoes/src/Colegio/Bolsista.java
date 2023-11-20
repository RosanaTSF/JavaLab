package Colegio;
public class Bolsista extends Aluno {
	private float bolsa; 
	
	public void renovarBolsa() {
		System.out.println(" Renovando bolsa do aluno(a): " + this.nome);
		
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(" Bolsa renovada do aluno(a): " + this.nome);
		
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}