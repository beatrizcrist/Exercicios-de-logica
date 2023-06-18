package exemplos;

import javax.swing.JOptionPane;

public class Exemplo05 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome");
		JOptionPane.showMessageDialog(null, nome);
	}
}
