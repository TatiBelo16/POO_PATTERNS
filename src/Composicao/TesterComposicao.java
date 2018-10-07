package Composicao;

public class TesterComposicao {

	public static void main(String[] args) {
		
		Servicos ic1 = new Servicos("Service","ERROR 11111");
		ImpressoraNova c1 = new ImpressoraNova(ic1);
		Servicos ic2 = new Servicos("Placa Logica","fff2222");
		ImpressoraAntiga c2 = new ImpressoraAntiga(ic2);
		System.out.println(c1.getlocacao());
		
		
		c1.getLocacao("6cc");
	
		
		c2.getManutencao();
		
		System.out.println();
		
	}

}

		

