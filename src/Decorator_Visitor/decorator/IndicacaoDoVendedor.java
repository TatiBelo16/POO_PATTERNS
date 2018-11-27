package decorator;

public class IndicacaoDoVendedor extends Vestimenta {

	public IndicacaoDoVendedor() {
		descricao = "Nosso vendedor indicou: ";
	}
	
	@Override
	public double preco() {
		// TODO Auto-generated method stub
		return .89;
	}

}
