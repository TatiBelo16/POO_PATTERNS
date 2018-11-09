package FabricaDinamicaESingleton;

public final class Pastel {

	private double preco;
	private String sabor;
	
	private static final Pastel Instancia = new Pastel(); //ex singleton
	
	public Pastel() {
		
	}



	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public static Pastel getInstancia() {
		return Instancia;
	}



	@Override
	public String toString() {
		return "Pastel [preco=" + preco + ", sabor=" + sabor + "]";
	}
	
	
	
	
}
