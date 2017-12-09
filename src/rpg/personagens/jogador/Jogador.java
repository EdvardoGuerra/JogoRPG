package rpg.personagens.jogador;

import rpg.itens.armas.Arma;
import rpg.itens.armas.CriacaoArmas;
import rpg.personagens.Personagem;

public abstract class Jogador extends Personagem
{
	private ClasseEnum classe;
	private int nivel;
	private int expAtual;
	private int expProxNivel;
	private Arma arma;
	
	//----------- Construtor --------------
	public Jogador(ClasseEnum classe)
	{
		this.classe = classe;
	}
	
	//----------- Getters e Setters --------------
	public ClasseEnum getClasse() 
	{
		return classe;
	}

	public void setClasse(ClasseEnum classe) 
	{
		this.classe = classe;
	}

	public int getNivel() 
	{
		return nivel;
	}

	public void setNivel(int nivel)
	{
		this.nivel = nivel;
	}

	public int getExpAtual() 
	{
		return expAtual;
	}

	public void setExpAtual(int expAtual) 
	{
		this.expAtual = expAtual;
	}

	public int getExpProxNivel() 
	{
		return expProxNivel;
	}

	public void setExpProxNivel(int expProxNivel) 
	{
		this.expProxNivel = expProxNivel;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	//----------- Métodos abstratos --------------
	public abstract void atacar();
	public abstract void defender();
	public abstract void usarMagia();
	public abstract void usarItem();
	
} //fim da classe Jogador
