package poteDeOuro;
public class Inventario {
	public static void main(String[] args) {
		Pet p1 = new Pet();
		Gato p2 = new Gato();
		Cachorro p3 = new Cachorro();
		Raposa p4 = new Raposa();
		
		p1.setNome(" Animais");
		p2.setNome(" Mingau");
		p3.setNome(" Catatau");
		p4.setNome(" Toddy");
		
		p1.setSexo(" F");
		p1.setIdade(2);
		p2.setSexo(" M");
		p2.setIdade(4);
		p3.setSexo(" M");
		p3.setIdade(5);
		p4.setSexo("M");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());	
		
	}
	
}
