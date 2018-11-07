package poo;

public class PersonagemBuilder {
	
	private Personagem personagem;
	
	public PersonagemBuilder(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public PersonagemBuilder arma (IArma arma) {
		personagem.setArma(arma);
		return this;
	}
	
	public PersonagemBuilder nome (String nome) {
		personagem.setNome(nome);
		return this;
	}
	
	public PersonagemBuilder apelido (String apelido) {
		personagem.setNome(apelido);
		return this;
	}
	
	public PersonagemBuilder habilidade (String habilidade){
		personagem.getHabilidades().add(habilidade);
		return this;
	}
	
	public PersonagemBuilder genero (String genero) {
		personagem.setGenero(genero);
		return this;
	}


}
