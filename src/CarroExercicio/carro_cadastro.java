package CarroExercicio;

import javax.swing.JOptionPane;

public class carro_cadastro {

	String marca;
	String cor;
	int anoProd;
	
	boolean cadastro() {
		
		marca = JOptionPane.showInputDialog("Informe a marca do veiculo");
		cor = JOptionPane.showInputDialog("Informe a cor do carro");
		anoProd = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de produção do veiculo"));
		return validaCadastro();
	}
		
			boolean validaCadastro;{
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "Cor é obrigatoria");
			return false;
			
		}
		
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "Cor é obrigatoria");
			return false;
			
		}
		if(marca.equals("")) {
			JOptionPane.showMessageDialog(null, "Cor é obrigatoria");
			return false;
			
		}
		

	}

}
