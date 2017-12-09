package rpg.itens.armas;

import java.util.ArrayList;
import java.util.List;

public class CriacaoArmas {

	private List<Arma> listaDeArmas = new ArrayList<>();
	
	public CriacaoArmas()
	{
		Arco arco1 = new Arco();
		listaDeArmas.add(arco1);
		arco1.setNomeArma("Arco de bronze");
		arco1.setDanoArma(5);
		arco1.setDefesaArma(1);
		arco1.setDurabilidade(10);
		
		Arco arco2 = new Arco();
		listaDeArmas.add(arco2);
		arco2.setNomeArma("Arco de prata");
		arco2.setDanoArma(15);
		arco2.setDefesaArma(2);
		arco2.setDurabilidade(20);
		
		Arco arco3 = new Arco();
		listaDeArmas.add(arco3);
		arco3.setNomeArma("Arco de ouro");
		arco3.setDanoArma(25);
		arco3.setDefesaArma(3);
		arco3.setDurabilidade(30);
		
		Cajado cajado1 = new Cajado();
		listaDeArmas.add(cajado1);
		cajado1.setNomeArma("Cajado de bronze");
		cajado1.setDanoArma(5);
		cajado1.setDefesaArma(1);
		cajado1.setMagiaArma(10);
		cajado1.setDurabilidade(10);
		
		Cajado cajado2 = new Cajado();
		listaDeArmas.add(cajado2);
		cajado2.setNomeArma("Cajado de prata");
		cajado2.setDanoArma(15);
		cajado2.setDefesaArma(2);
		cajado2.setMagiaArma(15);
		cajado2.setDurabilidade(20);
		
		Cajado cajado3 = new Cajado();
		listaDeArmas.add(cajado3);
		cajado3.setNomeArma("Cajado de ouro");
		cajado3.setDanoArma(25);
		cajado3.setDefesaArma(3);
		cajado3.setMagiaArma(20);
		cajado3.setDurabilidade(30);
		
		Escudo escudo1 = new Escudo();
		listaDeArmas.add(escudo1);
		escudo1.setNomeArma("Escudo de bronze");
		escudo1.setDanoArma(1);
		escudo1.setDefesaArma(10);
		escudo1.setDurabilidade(10);
		
		Escudo escudo2 = new Escudo();
		listaDeArmas.add(escudo2);
		escudo2.setNomeArma("Escudo de prata");
		escudo2.setDanoArma(2);
		escudo2.setDefesaArma(15);
		escudo2.setDurabilidade(20);
		
		Escudo escudo3 = new Escudo();
		listaDeArmas.add(escudo3);
		escudo3.setNomeArma("Escudo de ouro");
		escudo3.setDanoArma(3);
		escudo3.setDefesaArma(20);
		escudo3.setDurabilidade(30);
		
		Espada espada1 = new Espada();
		listaDeArmas.add(espada1);
		espada1.setNomeArma("Espada de bronze");
		espada1.setDanoArma(5);
		espada1.setDefesaArma(1);
		espada1.setDurabilidade(10);
		
		Espada espada2 = new Espada();
		listaDeArmas.add(espada2);
		espada2.setNomeArma("Espada de prata");
		espada2.setDanoArma(15);
		espada2.setDefesaArma(2);
		espada2.setDurabilidade(20);
		
		Espada espada3 = new Espada();
		listaDeArmas.add(espada3);
		espada3.setNomeArma("Espada de ouro");
		espada3.setDanoArma(25);
		espada3.setDefesaArma(3);
		espada3.setDurabilidade(30);
		
		Machado machado1 = new Machado();
		listaDeArmas.add(machado1);
		machado1.setNomeArma("Machado de bronze");
		machado1.setDanoArma(15);
		machado1.setDefesaArma(1);
		machado1.setDurabilidade(10);
		
		Machado machado2 = new Machado();
		listaDeArmas.add(machado2);
		machado2.setNomeArma("Machado de prata");
		machado2.setDanoArma(25);
		machado2.setDefesaArma(2);
		machado2.setDurabilidade(20);
		
		Machado machado3 = new Machado();
		listaDeArmas.add(machado3);
		machado3.setNomeArma("Machado de ouro");
		machado3.setDanoArma(35);
		machado3.setDefesaArma(3);
		machado3.setDurabilidade(30);
	}

	public List<Arma> getListaDeArmas() {
		return listaDeArmas;
	}

	public void setListaDeArmas(List<Arma> listaDeArmas) {
		this.listaDeArmas = listaDeArmas;
	}
	
	
}
