package FabricaDinamicaESingleton;

public class FabricaPastel {
	
	Pastel pastel = null;
		
	protected Pastel montarPastel() {
	 return Pastel.getInstancia();
	}
	
	public void definirPreco(double preco) {
		if(this.pastel != null) 
		this.pastel.setPreco(preco);
		
		else{
			montarPastel();
			this.pastel.setPreco(preco);
			}	
	}
	
	public void definirSabor(String sabor) {
		if(this.pastel != null) 
			this.pastel.setSabor(sabor);
			
			else{
				montarPastel();
				this.pastel.setSabor(sabor);
				}	
	}
	

}
