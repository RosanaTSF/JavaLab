package poteDeOuro;
public class Gato extends Pet {
	private int matriculaCrecheCat;
	private String corCat;
	
	public void cancelaCrecheCat() {
		System.out.println("Pet trocou de CrecheCat!");
		
	}

	public int getMatriculaCrecheCat() {
		return matriculaCrecheCat;
	}

	public void setMatriculaCrecheCat(int matriculaCrecheCat) {
		this.matriculaCrecheCat = matriculaCrecheCat;
	}

	public String getCorCat() {
		return corCat;
	}

	public void setCorCat(String corCat) {
		this.corCat = corCat;
	}
	
}


