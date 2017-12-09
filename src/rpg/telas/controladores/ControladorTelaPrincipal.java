package rpg.telas.controladores;

import java.util.ArrayList;
import java.util.List;

import rpg.itens.armas.Arco;
import rpg.itens.armas.Arma;
import rpg.itens.armas.Cajado;
import rpg.itens.armas.CriacaoArmas;
import rpg.itens.armas.Escudo;
import rpg.itens.armas.Espada;
import rpg.itens.armas.Machado;
import rpg.personagens.Personagem;
import rpg.personagens.inimigos.*;
import rpg.personagens.jogador.*;
import rpg.telas.TelaPrincipal;
import rpg.telas.interfaces.IEventosTelaPrincipal;
import rpg.telas.layout.LayoutAtributosBatalha;

public class ControladorTelaPrincipal implements IEventosTelaPrincipal
{
	private TelaPrincipal telaPrincipal;
	private CriacaoInimigos inimigos;
	private CriacaoArmas armas;
	
	public ControladorTelaPrincipal(TelaPrincipal telaPrincipal)
	{
		this.telaPrincipal = telaPrincipal;
		telaPrincipal.setInterfaceTelaPrincipal(this);
		
		this.armas = armas;
		List<Personagem> listaJogadores = new ArrayList<>();
		List<Personagem> listaInimigos = new ArrayList<>();
		
		Jogador guerreiro = new Arqueiro();
		listaJogadores.add(guerreiro);
		guerreiro.setNome("Edvardo");
		guerreiro.setPontosDeVida(50);
		guerreiro.setHabilidade(15);
		guerreiro.setMagia(0);
		guerreiro.setVelocidade(10);
		guerreiro.setArmadura(30);
		guerreiro.setDefesa(10);
		guerreiro.setForca(20);
		guerreiro.setNivel(1);
		guerreiro.setExpAtual(0);
		guerreiro.setExpProxNivel(100);
		//guerreiro.setArma(armas.getListaDeArmas().get(8));
	
		Jogador mago = new Mago();
		listaJogadores.add(mago);
		mago.setNome("Artur");
		mago.setPontosDeVida(30);
		mago.setHabilidade(20);
		mago.setMagia(30);
		mago.setVelocidade(8);
		mago.setArmadura(20);
		mago.setDefesa(5);
		mago.setForca(10);
		mago.setNivel(1);
		mago.setExpAtual(0);
		mago.setExpProxNivel(100);
		
		Inimigo elfo = new Elfo();
		listaInimigos.add(elfo);
		elfo.setNome("Elfo");
		elfo.setForca(5);
		elfo.setMagia(5);
		elfo.setDefesa(2);
		elfo.setHabilidade(5);
		elfo.setVelocidade(10);
		elfo.setArmadura(0);
		elfo.setPontosDeVida(20);
		elfo.setExpFornecida(5);
		
		Inimigo zumbi = new Zumbi();
		listaInimigos.add(zumbi);
		zumbi.setNome("Zumbi");
		zumbi.setForca(10);
		zumbi.setMagia(0);
		zumbi.setDefesa(2);
		zumbi.setHabilidade(0);
		zumbi.setVelocidade(5);
		zumbi.setArmadura(0);
		zumbi.setPontosDeVida(50);
		zumbi.setExpFornecida(5);
		
		Inimigo goblin = new Goblin();
		listaInimigos.add(goblin);
		goblin.setNome("Goblin");
		goblin.setForca(15);
		goblin.setMagia(5);
		goblin.setDefesa(10);
		goblin.setHabilidade(5);
		goblin.setVelocidade(8);
		goblin.setArmadura(10);
		goblin.setPontosDeVida(30);
		goblin.setExpFornecida(10);		
		
		telaPrincipal.adicionarListaPersonagens(listaJogadores, listaInimigos);
		telaPrincipal.setVisible(true);
		executarCarregamento();
	}

	public TelaPrincipal getTelaPrincipal() 
	{
		return telaPrincipal;
	}
	
	@Override
	public void eventoBotaoAtacar() 
	{
		System.out.println("Atacar");	
	}


	@Override
	public void eventoBotaoDefender() 
	{
		System.out.println("Defender");			
	}

	@Override
	public void eventoBotaoMagia() 
	{
		System.out.println("Magia");	
	}

	@Override
	public void eventoBotaoItens() 
	{
		System.out.println("Itens");			
	}
	
	
	public void executarCarregamento()
	{
		//iniciando threads
		if (telaPrincipal.getLayoutPersonagens() != null 
				&& telaPrincipal.getLayoutPersonagens().size() > 0)
		for (LayoutAtributosBatalha layout : telaPrincipal.getLayoutPersonagens())
		{
			new Thread(layout).start();
		}
		
		if (telaPrincipal.getLayoutInimigos() != null 
				&& telaPrincipal.getLayoutInimigos().size() > 0)
		for (LayoutAtributosBatalha layout : telaPrincipal.getLayoutInimigos())
		{
			new Thread(layout).start();
		}
	}
	
}
