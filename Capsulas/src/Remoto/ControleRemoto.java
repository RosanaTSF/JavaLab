package Remoto;
public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligando;
	private boolean tocando;
	private boolean ligado;
	
	public ControleRemoto() {
		this.volume = 50;
		this.setLigado(true);
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado() {
		return ligando;
	}
	private void setLigando(boolean ligando) {
		this.ligando = ligando;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigando(true);
		
	}

	@Override
	public void desligar() {
		this.setLigando(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("____Abrir menu____");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		System.out.println("");	
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()){
			this.setVolume(this.getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossível diminuir volume, pois está desligado");
		}
		
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Impossível diminuir, pois já está no mudo.");
		}
		
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0){
			this.setVolume(50);
		
		}
	}

	@Override
	public void play() {
		if(this.getLigado()&& this.getTocando()) {
			this.setTocando(true);
		} else {
			System.out.println("Não consegui reproduzir, pois está desligado");
		}
		
	}

	@Override
	public void pause() {
		if(this.getLigado()&& this.getTocando()) {
			this.setTocando(false);
		}
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
}
