package produto;

import decorator.VendaDecorator;
import decorator.Vestimenta;

public class Calca extends VendaDecorator {
	
	Vestimenta vestimenta;
	
	public Calca(Vestimenta vestimenta) {
		this.vestimenta = vestimenta;
	}

	@Override
	public String getDescricao() {
		return vestimenta.getDescricao()+" Calça ";
		
	}

	@Override
	public double preco() {
			return 60.00+vestimenta.preco();
	}

}
