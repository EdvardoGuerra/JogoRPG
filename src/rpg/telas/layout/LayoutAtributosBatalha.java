package rpg.telas.layout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import rpg.personagens.Personagem;
import rpg.telas.controladores.ControladorPersonagensBatalha;

public class LayoutAtributosBatalha extends JPanel implements Runnable
{
	
	private static final int TEMPO_ACAO = 18;
	
	private static final long serialVersionUID = 1L;
	private JLabel nomePersonagem;
	private JLabel lblPontosDeVida;
	private JLabel pontosDeVida;
	private JLabel lblPontosDeHabilidade;
	private JLabel pontosDeHabilidade;
	private JLabel lblForca;
	private JLabel ptsForca;
	private JLabel lblMagia;
	private JLabel ptsMagia;
	private JLabel lblArmadura;
	private JLabel ptsArmadura;
	private JLabel lblDefesa;
	private JLabel ptsDefesa;
	private JLabel lblNivel;
	private JLabel ptsNivel;
	private JLabel lblPontosExp;
	private JLabel pontosExp;
	private JProgressBar barraProgresso;
	private Personagem personagem;
	private ControladorPersonagensBatalha controlador;
	
	
	public LayoutAtributosBatalha(ControladorPersonagensBatalha controlador) 
	{
		this.setLayout(null);
		this.controlador = controlador;
		
		//adicionar no Jpanel		
		nomePersonagem = new JLabel();
		this.add(nomePersonagem);
		nomePersonagem.setBounds(10, 5, 70, 25);
		
		lblPontosDeVida = new JLabel("Vida: ");
		this.add(lblPontosDeVida);
		lblPontosDeVida.setBounds(10, 25, 50, 25);
		
		pontosDeVida = new JLabel("!!");
		pontosDeVida.setBounds(65, 25, 50, 25);
		this.add(pontosDeVida);
		
		lblPontosDeHabilidade = new JLabel("Habil.: ");	
		this.add(lblPontosDeHabilidade);
		lblPontosDeHabilidade.setBounds(100, 25, 50, 25);
		
		pontosDeHabilidade = new JLabel("!!");
		pontosDeHabilidade.setBounds(165, 25, 50, 25);
		this.add(pontosDeHabilidade);
		
		lblForca = new JLabel("Força: ");	
		this.add(lblForca);
		lblForca.setBounds(10, 45, 50, 25);
		
		ptsForca = new JLabel("!!");
		ptsForca.setBounds(65, 45, 50, 25);
		this.add(ptsForca);
		
		lblMagia = new JLabel("Magia: ");	
		this.add(lblMagia);
		lblMagia.setBounds(100, 45, 50, 25);
		
		ptsMagia = new JLabel("!!");
		ptsMagia.setBounds(165, 45, 50, 25);
		this.add(ptsMagia);
			
		lblDefesa = new JLabel("Defesa: ");	
		this.add(lblDefesa);
		lblDefesa.setBounds(10, 65, 50, 25);
		
		ptsDefesa = new JLabel("!!");
		ptsDefesa.setBounds(65, 65, 50, 25);
		this.add(ptsDefesa);
		
		lblArmadura = new JLabel("Armad: ");	
		this.add(lblArmadura);
		lblArmadura.setBounds(100, 65, 50, 25);
		
		ptsArmadura = new JLabel("!!");
		ptsArmadura.setBounds(165, 65, 50, 25);
		this.add(ptsArmadura);
		
		lblNivel = new JLabel("Nível: ");	
		this.add(lblNivel);
		lblNivel.setBounds(10, 85, 50, 25);
		
		ptsNivel = new JLabel("!!");
		ptsNivel.setBounds(65, 85, 50, 25);
		this.add(ptsNivel);
		
		lblPontosExp = new JLabel("Exp: ");	
		this.add(lblPontosExp);
		lblPontosExp.setBounds(100, 85, 50, 25);
		
		pontosExp = new JLabel("!!");
		pontosExp.setBounds(165, 85, 50, 25);
		this.add(pontosExp);
		
		barraProgresso = new JProgressBar();
		this.add(barraProgresso);
		barraProgresso.setBounds(10,120,170,15);
	}
	
	public void preencher(Personagem personagem)
	{
		this.personagem = personagem;
		this.nomePersonagem.setText(this.personagem.getNome());
		this.pontosDeVida.setText(String.valueOf(this.personagem.getPontosDeVida()));
		this.pontosDeHabilidade.setText(String.valueOf(this.personagem.getHabilidade()));
		this.ptsDefesa.setText(String.valueOf(this.personagem.getDefesa()));
		this.ptsForca.setText(String.valueOf(this.personagem.getForca()));
		this.ptsMagia.setText(String.valueOf(this.personagem.getMagia()));
		this.ptsArmadura.setText(String.valueOf(this.personagem.getArmadura()));

	}
	
	public void atualizarTela()
	{
		this.nomePersonagem.setText(this.personagem.getNome());
		this.pontosDeVida.setText(String.valueOf(this.personagem.getPontosDeVida()));
		this.pontosDeHabilidade.setText(String.valueOf(this.personagem.getHabilidade()));
		this.ptsDefesa.setText(String.valueOf(this.personagem.getDefesa()));
		this.ptsForca.setText(String.valueOf(this.personagem.getForca()));
		this.ptsMagia.setText(String.valueOf(this.personagem.getMagia()));
		this.ptsArmadura.setText(String.valueOf(this.personagem.getArmadura()));
	}
	
	public void preencherBarraProgresso() 
	{
		long tempoFrames = 1000 / 30;
		float progresso = 0.0f;
		long tempoInicial = System.currentTimeMillis();
		long tempoAtual = 0;
		int difTempo = TEMPO_ACAO - personagem.getVelocidade();
		
		while (!controlador.isAcaoAtiva())
		{
			tempoAtual = System.currentTimeMillis();
			if (progresso >= 100.0f) break;
			if ((tempoAtual-tempoInicial) >= tempoFrames)
			{
				tempoInicial = tempoAtual;
				progresso += 100.0f / (float)(difTempo) * ((float)tempoFrames/1000);
				barraProgresso.setValue((int)progresso);
			}
		}
		controlador.executarAcao(this);
	}

	//----------- Getters e Setters --------------
	public JLabel getPontosDeVida() 
	{
		return pontosDeVida;
	}

	public void setPontosDeVida(JLabel pontosDeVida) 
	{
		this.pontosDeVida = pontosDeVida;
	}

	public JLabel getPontosDeHabilidade() 
	{
		return pontosDeHabilidade;
	}

	public void setPontosDeHabilidade(JLabel pontosDeHabilidade) 
	{
		this.pontosDeHabilidade = pontosDeHabilidade;
	}

	public JLabel getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(JLabel nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public JProgressBar getBarraProgresso() {
		return barraProgresso;
	}

	public void setBarraProgresso(JProgressBar barraProgresso) {
		this.barraProgresso = barraProgresso;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public ControladorPersonagensBatalha getControlador() {
		return controlador;
	}

	public void setControlador(ControladorPersonagensBatalha controlador) {
		this.controlador = controlador;
	}
	
	public JLabel getForca() 
	{
		return ptsForca;
	}

	public void setForca(JLabel forca) 
	{
		this.ptsForca = forca;
	}

	public JLabel getMagia() {
		return ptsMagia;
	}

	public void setMagia(JLabel magia) 
	{
		this.ptsMagia = magia;
	}

	public JLabel getArmadura() 
	{
		return ptsArmadura;
	}

	public void setArmadura(JLabel armadura)
	{
		this.ptsArmadura = armadura;
	}
	
	public JLabel getPtsForca() 
	{
		return ptsForca;
	}

	public void setPtsForca(JLabel ptsForca)
	{
		this.ptsForca = ptsForca;
	}

	public JLabel getPtsMagia() 
	{
		return ptsMagia;
	}

	public void setPtsMagia(JLabel ptsMagia) 
	{
		this.ptsMagia = ptsMagia;
	}

	public JLabel getPtsArmadura() 
	{
		return ptsArmadura;
	}

	public void setPtsArmadura(JLabel ptsArmadura) 
	{
		this.ptsArmadura = ptsArmadura;
	}

	public JLabel getPtsDefesa()
	{
		return ptsDefesa;
	}

	public void setPtsDefesa(JLabel ptsDefesa) 
	{
		this.ptsDefesa = ptsDefesa;
	}

	public JLabel getPtsNivel() 
	{
		return ptsNivel;
	}

	public void setPtsNivel(JLabel ptsNivel) 
	{
		this.ptsNivel = ptsNivel;
	}

	public JLabel getPontosExp() 
	{
		return pontosExp;
	}

	public void setPontosExp(JLabel pontosExp) 
	{
		this.pontosExp = pontosExp;
	}

	@Override
	public void run() 
	{
		while(true)
		{
			preencherBarraProgresso();
		}	
	}

}
