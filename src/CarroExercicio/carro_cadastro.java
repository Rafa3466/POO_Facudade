package CarroExercicio;

import javax.swing.JOptionPane;

public class carro_cadastro {

	String marca;
	String cor;
	String anoProd;
	
	void cadastro() {
		
		marca = JOptionPane.showInputDialog("Informe a marca do veiculo");
		cor = JOptionPane.showInputDialog("Informe a cor do carro");
		anoProd = JOptionPane.showInputDialog("Informe o ano de produção do veiculo");
	}

}
