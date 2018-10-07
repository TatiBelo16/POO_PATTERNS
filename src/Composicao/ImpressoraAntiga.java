package Composicao;

public class ImpressoraAntiga {
	
	private Servicos ic;
	public ImpressoraAntiga( Servicos ic) {
		this.ic = ic;

	}
	public String getlocacao() {
		return ic.getLocacao();
	}
	
	public String getManutencao() {
		return ic.getManutencao();
	}
	
	public void informarServico(String NovoServico){
		ic.informarServico(NovoServico); // ver erro que apresentava 
	}
	
	public boolean manutencao(double idadeImpressora){
		if (idadeImpressora > 40){
		System.out.println("eh apto");
		return true;
		}
	return false;
		
	}
}

	
	

