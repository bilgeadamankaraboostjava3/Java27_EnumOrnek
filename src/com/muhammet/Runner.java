package com.muhammet;


import com.muhammet.dil.Dil;
import com.muhammet.dil.DilBuilder;
import com.muhammet.dil.Diller;

public class Runner {

	public static void main(String[] args) {
		
		/**
		 * Bir internet sitesinin dilini nasýl deðiþtirebilirim.
		 */
		// Dil dil = new Dil(); interface -> new ile yeni nesne türetemezsiniz.
		Dil dil = DilBuilder.buil(Diller.Ing);
		dil.getKarsilama();
		dil = DilBuilder.buil(Diller.Tr);
		dil.getKarsilama();
		dil = DilBuilder.buil(Diller.De);
		dil.getKarsilama();

		/**
		 * ortada hoþ geldiniz., menüler 
		 */
	}

}
