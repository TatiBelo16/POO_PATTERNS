package decorator;;

public class Masculina extends Vestimenta {

	public Masculina() {
		descricao = "Calça tamanho G";
	}

	@Override
	public double preco() {
		return 1.99;
	}

}
