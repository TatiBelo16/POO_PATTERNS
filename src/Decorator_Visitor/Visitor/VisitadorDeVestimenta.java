package Visitor;

import decorator.Vestimenta;

public class VisitadorDeVestimenta implements IVisitor{

	public VisitadorDeVestimenta() {
	}
	
		public String Visit(Vestimenta vestimenta) {
		return "Processando a venda,  "+vestimenta.getDescricao()+", custo: $"+vestimenta.preco();
	}

}
