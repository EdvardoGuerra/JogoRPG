package rpg.personagens;

public abstract class Personagem
{

	private String nome;
	private int forca;
	private int magia;
	private int defesa;
	private int habilidade;
	private int velocidade;
	private int armadura;
	private int pontosDeVida;
	private int pontosDeAtaque;
	private int pontosDeDefesa;
	private int pontosDeMagia;

	
	//----------- Construtor  --------------	
	public Personagem (){}
	
	//----------- Métodos Abstratos --------------
	public abstract void atacar();
	public abstract void defender();
	public abstract void usarMagia();

	//----------- Getters e Setters --------------
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public int getForca()
	{
		return forca;
	}

	public void setForca(int forca) 
	{
		this.forca = forca;
	}

	public int getMagia() 
	{
		return magia;
	}

	public void setMagia(int magia) 
	{
		this.magia = magia;
	}

	public int getDefesa() 
	{
		return defesa;
	}

	public void setDefesa(int defesa) 
	{
		this.defesa = defesa;
	}

	public int getHabilidade() 
	{
		return habilidade;
	}

	public void setHabilidade(int habilidade) 
	{
		this.habilidade = habilidade;
	}

	public int getVelocidade() 
	{
		return velocidade;
	}

	public void setVelocidade(int velocidade) 
	{
		this.velocidade = velocidade;
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public int getPontosDeVida() 
	{
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) 
	{
		this.pontosDeVida = pontosDeVida;
	}

	public int getPontosDeAtaque() 
	{
		return pontosDeAtaque;
	}

	public void setPontosDeAtaque(int pontosDeAtaque) 
	{
		this.pontosDeAtaque = pontosDeAtaque;
	}

	public int getPontosDeDefesa() 
	{
		return pontosDeDefesa;
	}

	public void setPontosDeDefesa(int pontosDeDefesa) 
	{
		this.pontosDeDefesa = pontosDeDefesa;
	}

	public int getPontosDeMagia() 
	{
		return pontosDeMagia;
	}

	public void setPontosDeMagia(int pontosDeMagia) 
	{
		this.pontosDeMagia = pontosDeMagia;
	}
	
} //fim da classe