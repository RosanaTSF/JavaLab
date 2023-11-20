package Kwaii;
public class Aula09 {
	public static void main(String[] args) {
		Otakus[] o = new Otakus[5];
		Animes[] a = new Animes[5];
		
		o[0] = new Otakus(" Bia", " RJ", 12);
		o[1] = new Otakus(" Liz", " Rec", 24);
		o[2] = new Otakus(" Frida"," SP" , 33);
		o[3] = new Otakus(" Caio", " RS" , 100);
		o[4] = new Otakus(" Cristian", " MG" , 110);
		
		a[0] = new Animes("Studio Gibli ", " Totoró ", 150, 17, true, o[0]);
		a[1] = new Animes("Demon Slayer ", " Tanjiro ", 120, 14, false, o[1]);
		a[2] = new Animes("Saloon Mon ", " Chibiusa ", 140, 10, false, o[2]);
		a[3] = new Animes("Kotaro Sato ", " Shin Karino ", 160, 119, false, o[3]);
		a[4] = new Animes("Chi's Sweet Home ", " Cochi ", 130, 10, true, o[4]);
		
		a[0].backEp();
		a[0].getOtaku();
		a[0].openEp();
		a[0].jumpEp();
		a[0].offEp();
		
		a[1].getOtaku();
		a[1].openEp();
		a[1].backEp();
		a[1].jumpEp();
		a[1].offEp();
		
		a[2].getOtaku();
		a[2].openEp();

		
		a[3].jumpEp();
		a[3].offEp();
		
		a[4].getOtaku();
		a[4].openEp();
		a[4].backEp();
		
		System.out.println(a[0].detalhes());
		System.out.println(a[1].detalhes());
		System.out.println(a[2].detalhes());
		System.out.println(a[3].detalhes());
		System.out.println(a[4].detalhes());
	





	}
}

