package decorator;

import Visitor.VisitadorDeVestimenta;
import produto.Calca;
import produto.CamisaSocialComBlazer;

public class Tester {

	public static void main(String[] args) {
		
		Vestimenta cli1 = new IndicacaoDoVendedor();
		cli1 = new Calca(cli1);
		cli1 = new CamisaSocialComBlazer(cli1);
					
		System.out.println(cli1.aceito(new VisitadorDeVestimenta()));
		
		}

}
