package poo;

public class Main {
	
	public static void main(String[] args) {
		
		Ferreiro ferreiro = new Ferreiro();
			
		IArma espada = ferreiro.makeArma("espada");
		IArma lanca = ferreiro.makeArma("lanca");
		
		Personagem soldado = new Personagem("Jhon Snow", "masculino");
		PersonagemBuilder pb1 = new PersonagemBuilder(soldado);
		
		
		pb1
		.apelido("john")
		.arma(lanca)
		.habilidade("cura");
		
		soldado.getArma().causarDano();
		
		Personagem monge = new Personagem("Monge", "masculino");
		PersonagemBuilder pb2 = new PersonagemBuilder(monge);
		
		pb2
		.apelido("apelido do monge")
		.habilidade("cura")
		.habilidade("benção divina");
		
	
	}

	
}
