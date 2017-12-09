package rpg.personagens.jogador;

import rpg.itens.armas.Arco;

public class Arqueiro extends Jogador
{
	private Arco arco = new Arco();
	
	public Arqueiro() {
		super(ClasseEnum.ARQUEIRO);
	}

	
	public Arco getArco() {
		return arco;
	}

	public void setArco(Arco arco) {
		this.arco = arco;
	}

	@Override
	public void atacar() 
	{
		int valorAtaque = this.getForca() + this.getHabilidade() + this.getArco().getDanoArma();
		System.out.println("Atacou com " + valorAtaque + " pontos");
	}

	@Override
	public void defender()
	{
		int valorDefesa = this.getForca() + this.getHabilidade() + this.getArco().getDefesaArma();
		System.out.println("Defendeu com " + valorDefesa + " pontos");
	}

	@Override
	public void usarMagia() 
	{
		
	}

	@Override
	public void usarItem() 
	{
		
	}
}
