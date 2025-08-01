package br.com.fiap.bean;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Equipe {
	private String nome;
	private ArrayList<String> integrantes;
	public Equipe() {}
	public Equipe(String nome, ArrayList<String> integrantes) {
		this.nome = nome;
		this.integrantes = integrantes;
	}
	public String getNome() { //ggas
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<String> integrantes) {
		this.integrantes = integrantes;
	}

	public void listarEquipe() {
		String exibe = String.format("Nome da equipe: %s \n", nome);
		Collections.sort(integrantes);
		int cont = 1;
		for(String i : integrantes) {
			exibe += String.format("Integrante %d: %s \n", cont, i);
			cont++;
		}
		JOptionPane.showMessageDialog(null, exibe, "Listagem da Equipe", JOptionPane.INFORMATION_MESSAGE);
	}
}

