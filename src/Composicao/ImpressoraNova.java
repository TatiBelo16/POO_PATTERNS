package Composicao;

public class ImpressoraNova {
	
	private Servicos ic;
	public ImpressoraNova ( Servicos ic) {
		this.ic = ic;

	}
	public String getlocacao() {
		return ic.getLocacao();
	}
	
	public String getManutencao() {
		return ic.getManutencao();
	}
	
	
	public void informarServico(String NovoServico){
		ic.informarServico(NovoServico); // erro era aqui 
		System.out.println("Solicitar Troca de impressora para : "+ic.getLocacao());
	}
	public void getLocacao(String string) {
		// TODO Auto-generated method stub
		
	}
	


	}


