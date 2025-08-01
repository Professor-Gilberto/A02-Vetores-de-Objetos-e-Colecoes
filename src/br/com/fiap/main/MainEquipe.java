package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MainEquipe {

	public static void main(String[] args) {
		Equipe grupo;
		String auxiliar, nome;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome da equipe");
				String membros = "continua";
				ArrayList<String> integrantes = new ArrayList<String>();
				while (membros.equalsIgnoreCase("continua")) {
					auxiliar = JOptionPane.showInputDialog("Digite integrante da equipe ou \"fim\" para encerrar.");
					if (auxiliar.equalsIgnoreCase("fim")) {
						membros = "fim";
					} else {
						integrantes.add(auxiliar);
					}
				}
				grupo = new Equipe(nome, integrantes);
				grupo.listarEquipe();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == 0);
		JOptionPane.showMessageDialog(null, "Fim de programa. Até breve!", "Adeus", JOptionPane.WARNING_MESSAGE);
	}
}


