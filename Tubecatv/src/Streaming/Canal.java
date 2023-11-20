package Streaming;
//main
public class Canal {
	public static void main(String[] args) {
		Video v[] = new Video[6];
		v[0] = new Video(" Amor Oculto");
		v[1] = new Video(" Navillera");
		v[2] = new Video(" Quando voo em sua direção");
		v[3] = new Video(" Pousando no Amor");
		v[4] = new Video(" Sorriso Real");
		v[5] = new Video(" Something in the Rain");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto(" Catatau", 3, "M", "pipoca", 0);
		g[1] = new Gafanhoto(" Mingau", 4, "F", "paçoca", 0);
		
		Engajamentos views[] = new Engajamentos[5];
		views[0] = new Engajamentos(g[0], v[2]);
		views[0].avaliar();
		views[0].avaliar(0);
		views[0].avaliar(95f);
		
		views[1] = new Engajamentos(g[0], v[3]);
		
		views[2] = new Engajamentos(g[0], v[4]);


		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println(v[3].toString());
		System.out.println(v[4].toString());
		System.out.println(v[5].toString());

		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		
		System.out.println(views[0].toString());	
	}
}
