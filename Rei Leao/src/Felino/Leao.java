package Felino;
public class Leao extends Animal {

	@Override
	public void emitirSom() {
		System.out.println("Hakuna Matataaa!");
	}
	
	public void reagir(String frase) {
		if(frase.equals("Brincar?!") || frase.equals("Simba!")) {
			System.out.println("Sorrir e pular!");
	} else { 
			System.out.println("Ir dormir");
		}
		
	}

	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Comer");
	} else if(hora >= 18) {
			System.out.println("Dormir");
		} else {
			System.out.println("Tomar banho");
			}
	
		}
	
	public void reagir(boolean pai) {
		if (pai) {
		System.out.println("Passear com o seu pai");
	} else {
		System.out.println("Passear com a mãe");
		
		}
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if (peso < 10) {
			System.out.println("Simba ainda eh um filhote!");
			} else {
			System.out.println("Simba eh o rei Leão!");
			}
		} else {
			if (idade < 15){
				System.out.println("Simba cresceu!");
		
			} else {
				System.out.println("Simba eh o rei da Selva!");
					
			}
		}
	}
}
		

