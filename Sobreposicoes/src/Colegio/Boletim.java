package Colegio;
public class Boletim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome(" Penélope");
		a1.setMatricula(1313);
		a1.setCurso(" Artes");
		a1.setSexo(" F");
		a1.setIdade(7);
		
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setNome(" Pipoca");
		b1.setMatricula(0254);
		b1.setCurso(" Artes");
		b1.setSexo(" M");
		b1.setIdade(1);
		
		b1.setBolsa(12.5f);
		b1.pagarMensalidade();
		
	}
	
}
