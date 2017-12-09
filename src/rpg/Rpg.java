package rpg;

import rpg.itens.armas.CriacaoArmas;
import rpg.personagens.inimigos.CriacaoInimigos;
import rpg.telas.TelaPrincipal;
import rpg.telas.controladores.ControladorTelaPrincipal;

public class Rpg 
{
	public static void main(String[] args) 
	{
		TelaPrincipal telaPrincipal = new TelaPrincipal();
		CriacaoArmas armas = new CriacaoArmas();
		CriacaoInimigos inimigos = new CriacaoInimigos();
		ControladorTelaPrincipal controladorTelaPrincipal = new ControladorTelaPrincipal(telaPrincipal);
		
	} //fim de main
	
} //fim de Rpg
