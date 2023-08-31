package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class time_ {
	
	private String nome;
	private ArrayList<lista_jogador> jogadores = new ArrayList<lista_jogador>();

	public void cadastrar() {
		setNome(JOptionPane.showInputDialog("Nome do Time"));
		String continua = "";
		do {
			
			lista_jogador j = new lista_jogador();
			j.cadastrar();
			jogadores.add(j);
			continua = JOptionPane.showInputDialog("Mais jogadores? S/N");
		}while(continua.equalsIgnoreCase("S"));
	}
	
	public String exibir() {
		String dados = "***" + getNome() + "***\n";
		for(lista_jogador j: jogadores) {
			dados += j.exibir();
			
		}
		return dados;
}
	
		public lista_jogador artilheiroTime() {
			lista_jogador art = jogadores.get(0);
			for(lista_jogador j : jogadores ) {
				if(j.getGols() > art.getGols()) {
					art = j;
				}
			}
			return art;
		}
		
		public int getGolsTime() {
			int gols = 0;
			for(lista_jogador j : jogadores ) {
				gols += j.getGols();
			}
			return gols;
		}
			public String getNome() {
				return nome;
		}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public ArrayList<lista_jogador> getJogadores() {
				return jogadores;
			}
			public void setJogadores(ArrayList<lista_jogador> jogadores) {
				this.jogadores = jogadores;
			}
			
			

		}