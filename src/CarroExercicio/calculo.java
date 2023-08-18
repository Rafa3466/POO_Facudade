package CarroExercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class calculo {

	public static void main(String[] args) {
		ArrayList<carro_cadastro> carros = new ArrayList<carro_cadastro>();
		
		do {
		int operador = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer?\n\n" +
				"1 - Cadastrar novo carro no estoque\n" + 
				"2 - Listar por cor\n" + 
				"3 - Listar por Marca\n" +
				"4 - Sair"));
		
		switch (operador) {
	     case 1:
	    	 carro_cadastro a = new carro_cadastro();
	    	 a.cadastro();
	    	 carros.add(a);
	    	 
	       break;
	     case 2:
	         String resultado = "Carros cadastrados\n";
	         for (carro_cadastro a1 : carros) {        // : para poder ver dentro do catalogo carros
	        	 resultado += a1.exibirDados();
	         }JOptionPane.showMessageDialog(null, resultado);
	         break;
	       case 3:
	    	   System.out.println("Teste3");
	         break;
	       case 4:
	    	   System.out.println("Teste4");
	         break;
	       
	     default:
	         System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
		}
		
		}while (1 == 1);
		
	}
}

