package menu;

import java.util.ArrayList;
import java.util.Scanner;

import dao.Dao;
import dao.DaoArrayList;
import modelos.DadosMet;

public class relatorio extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Relat�rio";
	}

	@Override
	public boolean executar() {
		Scanner ler =  new Scanner(System.in);
		System.out.print("Insira o ano que deseja obter o relat�rio: ");
		int ano = ler.nextInt();
		System.out.print("Insira o m�s que deseja obter relat�rio: ");
		int mes = ler.nextInt();
		
		
		Dao dao = new DaoArrayList();
		ArrayList<DadosMet> dadosMet = dao.listar();
		
		for(int i = 0; i < dadosMet.size(); i++ ) {
			DadosMet atual = dadosMet.get(i);
			if(atual.getAno() == ano && atual.getMes() == mes) {
				atual.relatorio();
			}
			
		}
		return false;
	}

}
