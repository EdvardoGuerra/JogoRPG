package rpg.telas.controladores;

import rpg.personagens.inimigos.Inimigo;
import rpg.telas.layout.LayoutAtributosBatalha;

public class ControladorPersonagensBatalha
{
	private boolean acaoAtiva = false;
	
	public synchronized boolean isAcaoAtiva()
	{
		return acaoAtiva;
	}
	
	public synchronized void executarAcao(LayoutAtributosBatalha layoutAcao)
	{
		//executar ação personagem
		this.acaoAtiva =  true;
		System.out.println("Executando ação de " + layoutAcao.getPersonagem().getNome());
				
		if (layoutAcao.getPersonagem() instanceof Inimigo)
		{
			System.out.println("É um inimgo");
		} else
		{
			System.out.println("É um jogador");
		}
		//término da ação
		try 
		{
			Thread.currentThread().sleep(3000);
		} 
		catch (InterruptedException e) {}
		
		System.out.println("Fim da ação de " + layoutAcao.getPersonagem().getNome());
		this.acaoAtiva =  false;
	}
}
