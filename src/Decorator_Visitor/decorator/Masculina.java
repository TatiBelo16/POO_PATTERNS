package decorator;;

public class Masculina extends Vestimenta {

	public Masculina() {
		descricao = "Cal�a tamanho G";
	}

	@Override
	public double preco() {
		return 1.99;
	}

}
