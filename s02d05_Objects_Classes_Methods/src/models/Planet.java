package models;

public class Planet {
	
	private Integer tezina;
	private Integer masa;
	@SuppressWarnings("unused")
	private String oblik;
	@SuppressWarnings("unused")
	private String ime;
	private static final Integer g = 10;
	
	// Ovo je konstruktor nase klase
	/**
		@param tezina;
		@param masa;
		@param oblik;
		@param ime;
	*/
	
		
		public Planet(Integer tezina, Integer masa, String oblik, String ime) {
			super();
			this.tezina = tezina;
			this.masa = masa;
			this.oblik = oblik;
			this.ime = ime;
		}
		
		public Planet() {
			
		}
		
		public void dodajMasu (Integer dodatak) {
			this.masa += dodatak;
		}
		/** 
		 * Metoda za povecavanje mase tijela
		*/
		public Integer vrijednostMase () {
			return this.masa;
		}
		
		/** 
		 * Metoda za racuanje tezine tijela
		*/
		public Integer racunajTezinu() {
			this.tezina = this.masa * g;
			return (this.tezina);
		}

}
