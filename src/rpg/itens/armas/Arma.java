package rpg.itens.armas;

public class Arma
{
	private TipoArmaEnum tipoArma;
	private String nomeArma;
	private int danoArma;
	private int defesaArma;
	private int durabilidade;
	
	//----------- Construtor --------------
	public Arma(TipoArmaEnum tipoArma)
	{
		this.tipoArma = tipoArma;
	}

	//----------- Getters e Setters --------------
	public TipoArmaEnum getTipoArma() 
	{
		return tipoArma;
	}

	public String getNomeArma() 
	{
		return nomeArma;
	}

	public void setNomeArma(String nomeArma) 
	{
		this.nomeArma = nomeArma;
	}

	public void setTipoArma(TipoArmaEnum tipoArma) 
	{
		this.tipoArma = tipoArma;
	}

	public int getDanoArma() 
	{
		return danoArma;
	}

	public void setDanoArma(int danoArma) 
	{
		this.danoArma = danoArma;
	}

	public int getDefesaArma() 
	{
		return defesaArma;
	}

	public void setDefesaArma(int defesaArma) 
	{
		this.defesaArma = defesaArma;
	}

	public int getDurabilidade() 
	{
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) 
	{
		this.durabilidade = durabilidade;
	}	
	
} //fim da classe
