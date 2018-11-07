package poo;

public class ArmaFactory {

	public IArma getArma(String tipo) {
		
		IArma arma = null;
		
		if(tipo.equalsIgnoreCase("arco")) {
			arma = new Arco();
			
		}else if (tipo.equalsIgnoreCase("espada")) {
			arma = new Espada();
	
		}else if (tipo.equalsIgnoreCase("machado")) {
			arma = new Machado();

		}else if (tipo.equalsIgnoreCase("lanca")) {
			arma = new Lanca();
		}
		
		return arma;
	}
	
}
