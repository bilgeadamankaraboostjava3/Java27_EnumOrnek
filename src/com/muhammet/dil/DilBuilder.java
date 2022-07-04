package com.muhammet.dil;

public class DilBuilder {

	/**
	 * Se�ilen dili d�ndermek(return)
	 * String -> tr, T�rk�e, T�rk, trk, 
	 * int -> 1->tr, 2->ing, 3-> de
	 */
	
	public static Dil buil(Diller secilenDil) {		
		switch (secilenDil) {
		case Tr: return  new Turkce();
		case Fr: return new Turkce();
		case Ing: return  new Ingilizce(); 
		case De: return new Almanca(); 
		default: return new Turkce();
		}
		
	}
	
}
