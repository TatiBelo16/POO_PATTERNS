package strategy;

public class Parcelado12Vezes extends ModoPagamento{

	@Override
	public double calcula(double valor) {
		
		System.out.println("E parcelando em 12 parcelas, o valor fica:  ");
		return (valor/12)*1.15;
		
	}

	@Override
	public double undo() {
		
		return 0;
	}

}
