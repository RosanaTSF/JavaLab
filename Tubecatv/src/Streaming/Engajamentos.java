package Streaming;
public class Engajamentos {
	private Gafanhoto espectador;
	private Video doramas;
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getDoramas() {
		return doramas;
	}
	public void setDoramas(Video doramas) {
		this.doramas = doramas;
	}
	public Engajamentos(Gafanhoto espectador, Video doramas) {
		this.espectador = espectador;
		this.doramas = doramas;
		this.espectador.setToAssistido(this.espectador.getToAssistido() +1);
		this.doramas.setViews(this.doramas.getViews() +1);
	
	}
	public void avaliar() {
		this.doramas.setAvaliacao(5);	
	}
	public void avaliar (int nota) {
		this.doramas.setAvaliacao(nota);
		
	}
	public void avaliar(float porc) {
		int tot = 0;
		if(porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		} this.doramas.setAvaliacao(tot);
	}
	
	@Override
	public String toString() {
		return " Engajamentos: "
	+ espectador 
	+ ", " + doramas 
	+ " ";
		
	}
}
	
	
