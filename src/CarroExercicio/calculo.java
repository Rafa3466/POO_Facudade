package CarroExercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class calculo {

	public static void main(String[] args) {
		ArrayList<carro_cadastro> Lista = new ArrayList<carro_cadastro>();
		
		do {
		int operador = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer?\n\n" +
				"1 - Cadastrar novo carro no estoque\n" + 
				"2 - Listar por ano de Fabricação\n" + 
				"3 - Listar por Marca\n" + 
				"3 - Listar por cor\n\n" +
				"4 - Sair"));
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(operador))
					
					if(op == 1) {
						carro_cadastro c = new carro_cadastro();
						if(c.cadastrar()) {
							lista.add(c);
							}
						}
	
				}while(op!=5);
		}
	
		static void buscaPorPeriodo(ArrayList<carro_cadastro>Lista)	{
			int anoI = Integer.parseInt(JOptionPane.showInputDialog(null));
			int anoF = Integer.parseInt(JOptionPane.showInputDialog(null));
			
			for( carro_cadastro c : lista) {
				if( anoI >= c.anoProd && anoF <= c.ano)	{
					dados += c.marca + "-" + c
					
				}
			}
		}
}
}
