package poteDeOuro;

public class Raposa extends Pet {
	private String setor;
	private Boolean brincando; 
	
	public void mudarBrincadeira() {
		this.brincando  = ! this.brincando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Boolean getBrincando() {
		return brincando;
	}

	public void setBrincando(Boolean brincando) {
		this.brincando = brincando;
	}
}
