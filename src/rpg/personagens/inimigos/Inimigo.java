package rpg.personagens.inimigos;

import rpg.personagens.Personagem;

public abstract class Inimigo extends Personagem
{
	private RacasEnum raca;
	private int expFornecida;
	
	//----------- Construtor --------------
	public Inimigo(RacasEnum raca)
	{
		this.raca = raca;
	}
	
	//----------- Getters e Setters --------------
	public RacasEnum getRaca() 
	{
		return raca;
	}

	public void setRaca(RacasEnum raca) 
	{
		this.raca = raca;
	}
	
	public int getExpFornecida()
	{
		return expFornecida;
	}

	public void setExpFornecida(int expFornecida) 
	{
		this.expFornecida = expFornecida;
	}

	//----------- Métodos abstratos --------------
	public abstract void atacar();
	public abstract void defender();
	public abstract void usarMagia();
	
} //fim da classe
