package rpg.itens.armas;

import rpg.itens.armas.Arma;

public class Cajado extends Arma
{
	private int magiaArma;
	//----------- Construtor --------------
	public Cajado() 
	{
		super(TipoArmaEnum.CAJADO);
	}
	
	//----------- Getters e Setters --------------
	public int getMagiaArma() 
	{
		return magiaArma;
	}
	
	public void setMagiaArma(int magiaArma) 
	{
		this.magiaArma = magiaArma;
	}
	
} //fim da classe
