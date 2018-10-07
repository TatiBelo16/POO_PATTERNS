package strategy;

public class Boleto extends ModoPagamento {
	
	public double calcula(double valor) {
		System.out.println("O valor a ser pago no boleto a vista é: ");
		return valor*0.90;
	}

	public double undo() {
		
		return 0;
	}

}



