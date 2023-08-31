package desafio_jogador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class menuu {
    public static void main(String[] args) {
        ArrayList<time_> times = new ArrayList<time_>();
        String menu = "1 - Cadastrar time.\n"
                    + "2 - Listar jogadores por time.\n"
                    + "3 - Verificar artilheiro por time.\n"
                    + "4 - Time com mais gols.\n"
                    + "5 - Sair!\n";
                
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
            	time_ t = new time_();
                t.cadastrar();
                times.add(t);
            }
            if (op == 2) {

                String ask = JOptionPane.showInputDialog("Qual o nome de time que deseja consultar?");
                String result = "Jogadores no time: \n";

                for (time_ t : times) {
                    if (ask.equalsIgnoreCase(t.getNome())) {
                        result += t.exibir();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 3) {

                String ask = JOptionPane.showInputDialog("Qual o nome de time que deseja consultar o artilheiro?");
                String result = "Artilheiro do time: \n";

                for (time_ t : times) {
                    if (ask.equalsIgnoreCase(t.getNome())) {
                        lista_jogador artilheiro = t.artilheiroTime();
                        result += artilheiro.exibir();
                    }
                }
                JOptionPane.showMessageDialog(null, result);

            }
            if (op == 4) {
            	time_ timeMaisGols = null;
                int maxGols = -1; 

                for (time_ t : times) {
                    int golsTime = t.getGolsTime();
                    if (golsTime > maxGols) {
                        maxGols = golsTime;
                        timeMaisGols = t;
                    }
                }

                if (timeMaisGols != null) {
                    JOptionPane.showMessageDialog(null,
                            "Time com mais gols: " + timeMaisGols.getNome() + " - Total de gols: " + maxGols);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Não há times cadastrados ou não foi possível determinar o time com mais gols.");
                }
            }

        } while (op != 5);
    }
}