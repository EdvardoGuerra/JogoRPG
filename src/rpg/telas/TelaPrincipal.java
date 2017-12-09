package rpg.telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import rpg.personagens.Personagem;
import rpg.personagens.inimigos.*;
import rpg.personagens.jogador.Jogador;
import rpg.telas.controladores.ControladorPersonagensBatalha;
import rpg.telas.interfaces.IEventosTelaPrincipal;
import rpg.telas.layout.LayoutAtributosBatalha;

public class TelaPrincipal extends JFrame 
{
	private static final long serialVersionUID = 1L;
	//tamanho tela do jogo
	private static final int TAMANHO_TELA_JOGO_X = 560;
	private static final int TAMANHO_TELA_JOGO_Y = 550;
	
	//tamanho padrão
	private static final int TAMANHO_TELA_X = 190;
	private static final int TAMANHO_TELA_Y = 140;
	
	//posicionamento x
	private static final int POS_X_JOGADOR = 10;
	private static final int POS_X_INIMIGO = 340;
	
	private IEventosTelaPrincipal interfaceTelaPrincipal;
	
	//atributos tela
	JPanel painel;
	
	//Lista de personagens do jogador
	private List<Personagem> listaJogadores;
	private List<Personagem> listaInimigos;
	private List<LayoutAtributosBatalha> layoutPersonagens;
	private List<LayoutAtributosBatalha> layoutInimigos;
	
	//controlador
	private ControladorPersonagensBatalha controlador;	
	
	public List<LayoutAtributosBatalha> getLayoutPersonagens() 
	{
		return layoutPersonagens;
	}

	public void setLayoutPersonagens(List<LayoutAtributosBatalha> layoutPersonagens) 
	{
		this.layoutPersonagens = layoutPersonagens;
	}

	public TelaPrincipal()
	{
		super("Jogo de RPG");
		//controlador
		this.controlador = new ControladorPersonagensBatalha();
		
		//iniciar lista de personagens
		listaJogadores = new ArrayList<>();
		listaInimigos = new ArrayList<>();
		layoutPersonagens = new ArrayList<>();
		layoutInimigos = new ArrayList<>();
		
		painel = new JPanel();
		this.add(painel);
		painel.setLayout(null);

		JButton bttAtacar = new JButton("Atacar");
		JButton bttDefender = new JButton("Defender");
		JButton bttItens = new JButton("Itens");
		JButton bttMagia = new JButton("Magia");
		
		painel.add(bttAtacar);
		bttAtacar.setBounds(15,460,90,35);
		bttAtacar.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				interfaceTelaPrincipal.eventoBotaoAtacar();
			}
		});
		
		painel.add(bttDefender);
		bttDefender.setBounds(115,460,90,35);
		bttDefender.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				interfaceTelaPrincipal.eventoBotaoDefender();
			}
		});
		
		painel.add(bttItens);
		bttItens.setBounds(215,460,90,35);
		bttItens.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				interfaceTelaPrincipal.eventoBotaoItens();
			}
		});
		
		painel.add(bttMagia);
		bttMagia.setBounds(315,460,90,35);
		bttMagia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				interfaceTelaPrincipal.eventoBotaoMagia();
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(150, 35, TAMANHO_TELA_JOGO_X, TAMANHO_TELA_JOGO_Y);
		
		
	}
	
	public void adicionarListaPersonagens(List<Personagem> listaJogadores, List<Personagem> listaInimigos)
	{
		this.listaJogadores = listaJogadores;
		this.listaInimigos = listaInimigos;
		adicionarJogadoresNaTela();
		adicionarInimigosNaTela();
	}
	
	private void adicionarPersonagensNaTela(List<Personagem> personagens)
	{
		int posY=10;
		for (Personagem personagem : personagens)
		{
			LayoutAtributosBatalha layoutPersonagem = new LayoutAtributosBatalha(this.controlador);
			if (personagem instanceof Jogador)
			{
				layoutPersonagens.add(layoutPersonagem);
				layoutPersonagem.setBounds(POS_X_JOGADOR, posY, TAMANHO_TELA_X, TAMANHO_TELA_Y);
				layoutPersonagem.setBackground(Color.YELLOW);
			} else if (personagem instanceof Inimigo)
			{
				layoutInimigos.add(layoutPersonagem);
				layoutPersonagem.setBounds(POS_X_INIMIGO, posY, TAMANHO_TELA_X, TAMANHO_TELA_Y);
				layoutPersonagem.setBackground(Color.GRAY);
			}
			
			layoutPersonagem.preencher(personagem);
			this.painel.add(layoutPersonagem);
			posY += TAMANHO_TELA_Y + 10;
		}
	}
	
	public void adicionarJogadoresNaTela()
	{
		adicionarPersonagensNaTela(listaJogadores);
	}
	
	public void adicionarInimigosNaTela()
	{
		adicionarPersonagensNaTela(listaInimigos);
	}

	public IEventosTelaPrincipal getInterfaceTelaPrincipal() 
	{
		return interfaceTelaPrincipal;
	}

	public void setInterfaceTelaPrincipal(IEventosTelaPrincipal interfaceTelaPrincipal) 
	{
		this.interfaceTelaPrincipal = interfaceTelaPrincipal;
	}

	public List<Personagem> getListaJogadores() 
	{
		return listaJogadores;
	}

	public void setListaJogadores(List<Personagem> listaJogadores) 
	{
		this.listaJogadores = listaJogadores;
	}

	public List<Personagem> getListaInimigos() 
	{
		return listaInimigos;
	}

	public void setListaInimigos(List<Personagem> listaInimigos) 
	{
		this.listaInimigos = listaInimigos;
	}

	public List<LayoutAtributosBatalha> getLayoutInimigos() 
	{
		return layoutInimigos;
	}

	public void setLayoutInimigos(List<LayoutAtributosBatalha> layoutInimigos) 
	{
		this.layoutInimigos = layoutInimigos;
	}
}
