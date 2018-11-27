package produto;

import decorator.VendaDecorator;
import decorator.Vestimenta;

public class CamisaSocialComBlazer extends VendaDecorator{

	Vestimenta vestimenta;
	
	public CamisaSocialComBlazer(Vestimenta vestimenta) {
		this.vestimenta = vestimenta;
	}
	
	@Override
	public String getDescricao() {
		return vestimenta.getDescricao() + " ,Camisa Social e Blazer";
	}

	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return 139.60 + vestimenta.preco();
	}

}
