package strategy;

public class Parcelado6Vezes extends ModoPagamento{

	@Override
	public double calcula(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Parcelando em 06 parcelas, o valor fica:  ");
		return (valor/6) * 1.10;
	}

	@Override
	public double undo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
