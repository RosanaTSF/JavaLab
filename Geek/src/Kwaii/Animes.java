package Kwaii;
public class Animes implements Streaming{
	private String anime;
	private String personagem;
	private int epTotal;
	private int epAtual;
	private boolean open;
	private Otakus otaku;
	
	public String detalhes() {
		return "Status: \n" 
				+ "Anime = " + anime 
				+ "\n personagem = " + personagem 
				+ "\n epTotal = " + epTotal 
				+ "\n epAtual = " + epAtual
				+ "\n open = " + open 
				+ "\n otaku = " + otaku.getNome()
				+ "\n cidade = " + otaku.getCidade()
				+ "\n idade = " + otaku.getIdade();
	}

	public String getAnime() {
		return anime;
	}

	public void setAnime(String anime) {
		this.anime = anime;
	}

	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}

	public int getEpTotal() {
		return epTotal;
	}

	public void setEpTotal(int epTotal) {
		this.epTotal = epTotal;
	}

	public Otakus getOtaku() {
		return otaku;
	}

	public void setOtaku(Otakus otaku) {
		this.otaku = otaku;
	}

	public Animes(String anime, String personagem, int epTotal, int epAtual, boolean open, Otakus otaku) {
		super();
		this.anime = anime;
		this.personagem = personagem;
		this.epTotal = epTotal;
		this.epAtual = 0;
		this.open = false;
		this.otaku = otaku;
	}

	@Override
	public void openEp() {
		this.open = true;	
	}

	@Override
	public void offEp() {
		this.open = false;	
	}

	@Override
	public void pauseEp() {
		if (this.open = true) {
			System.out.println("Ep pausado");
		} else {
			System.out.println("Ep off, e não pausado!");
		}
	}

	@Override
	public void jumpEp() {
		this.epAtual++;
	}

	@Override
	public void backEp() {
		this.epAtual--;	
	}
	
}
