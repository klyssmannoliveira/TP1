package menu;

import java.util.ArrayList;
import java.util.Scanner;

import dao.Dao;
import dao.DaoArrayList;
import modelos.DadosMet;

public class buscaMenorTemp extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Menor temperatura";
	}

	@Override
	public boolean executar() {
		Scanner ler =  new Scanner(System.in);
		System.out.print("Insira o ano que deseja obter a menor temperatura: ");
		int ano = ler.nextInt();
		System.out.print("Insira o mês que deseja obter a menor temperatura: ");
		int mes = ler.nextInt();
		
		
		Dao dao = new DaoArrayList();
		ArrayList<DadosMet> dadosMet = dao.listar();
		
		for(int i = 0; i < dadosMet.size(); i++ ) {
			DadosMet atual = dadosMet.get(i);
			if(atual.getAno() == ano && atual.getMes() == mes) {
				atual.buscaMenorTemp();
			}
			
		}
		return false;
	}

}
