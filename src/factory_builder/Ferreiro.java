package poo;

public class Ferreiro {

	private ArmaFactory af = new ArmaFactory();
	
	IArma makeArma(String tipo) {
		return this.af.getArma(tipo);
	}
}
