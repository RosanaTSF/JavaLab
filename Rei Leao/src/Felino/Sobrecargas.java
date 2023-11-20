package Felino;
public class Sobrecargas {
	public static void main(String[] args) {
	Mamifero m = new Mamifero();
	m.emitirSom();
	
	Suricato s = new Suricato();
	s.emitirSom();
	
	Leao l = new Leao();
	l.emitirSom();
	l.reagir(false);
	l.reagir("Simba!");
	l.reagir(5, 10);
	l.reagir(15, 100);
	l.reagir(4, 4.5f);
	}
	
}
