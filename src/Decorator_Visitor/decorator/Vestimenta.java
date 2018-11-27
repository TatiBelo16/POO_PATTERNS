package decorator;

import Visitor.IItemProduto;
import Visitor.VisitadorDeVestimenta;

public  class Vestimenta implements IItemProduto{
	
	String descricao = "Processando a venda... ";

	public String getDescricao() {
		return descricao;
	}

	public double preco() {
		return 0;
	}

	@Override
	public String aceito(VisitadorDeVestimenta visitadorDeVestimenta) {
		return visitadorDeVestimenta.Visit(this);
	}
	
	
}
