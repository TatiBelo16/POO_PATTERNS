package poo;

import java.util.Set;
import java.util.HashSet;

public class Personagem {
	
	private String nome;
	private String genero;
	private String apelido;
	private IArma arma;
	private Set<String> habilidades = new HashSet<String>();
		
	public Personagem(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}
	
	public void addHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}
	
	public void removeHabilidade(String habilidade) {
		this.habilidades.remove(habilidade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public IArma getArma() {
		return arma;
	}
	public void setArma(IArma arma) {
		this.arma = arma;
	}
	public Set<String> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Set<String> habilidades) {
		this.habilidades = habilidades;
	}

}
