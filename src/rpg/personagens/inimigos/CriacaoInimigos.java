package rpg.personagens.inimigos;

import java.util.ArrayList;
import java.util.List;

import rpg.personagens.Personagem;

public class CriacaoInimigos 
{
	public static List<Personagem> listaInimigos = new ArrayList<>();
	
	public static List<Personagem> CriacaoInimigos()
	{
		Inimigo elfo = new Elfo();
		listaInimigos.add(elfo);
		elfo.setNome("Elfo");
		elfo.setPontosDeVida(20);
		elfo.setHabilidade(0);
		elfo.setVelocidade(10);
		
		Inimigo zumbi = new Zumbi();
		listaInimigos.add(zumbi);
		zumbi.setPontosDeVida(20);
		zumbi.setHabilidade(0);
		zumbi.setVelocidade(15);
		zumbi.setNome("Zumbi");
		
		Inimigo humano = new Humano();
		listaInimigos.add(humano);
		humano.setPontosDeVida(20);
		humano.setHabilidade(0);
		humano.setVelocidade(12);
		humano.setNome("Humano");
		return listaInimigos;
	
	}

	public List<Personagem> getListaInimigos() {
		return listaInimigos;
	}

	public void setListaInimigos(List<Personagem> listaInimigos) {
		this.listaInimigos = listaInimigos;
	}
	
	
} //fim da classe
