package rpg.personagens.jogador;

import java.util.List;

import rpg.itens.armas.Arma;
import rpg.itens.armas.CriacaoArmas;

public class Guerreiro extends Jogador
{
	private CriacaoArmas armasCriadas;
	private List<Arma> listaEspadas;
	
	public Guerreiro() {
		super(ClasseEnum.GUERREIRO);
	}

	@Override
	public void atacar() 
	{
		
	}

	@Override
	public void defender() 
	{
		
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
