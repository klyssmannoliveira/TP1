package menu;

import java.util.ArrayList;
import java.util.Scanner;

import dao.Dao;
import dao.DaoArrayList;
import modelos.DadosMet;

public class buscaMaiorTemp extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Maior temperatura";
	}

	@Override
	public boolean executar() { // Leitura do ano/mes para buscar as informa��es no arraylist
		Scanner ler =  new Scanner(System.in);
		System.out.print("Insira o ano que deseja obter a maior temperatura: ");
		int ano = ler.nextInt();
		System.out.print("Insira o m�s que deseja obter a maior temperatura: ");
		int mes = ler.nextInt();
		
		//inicia a interface DAO e cria um Arraylist chamado DadosMet, lembrando que dao.listar retorna um Arraylist;
		Dao dao = new DaoArrayList();
		ArrayList<DadosMet> dadosMet = dao.listar();
		
		for(int i = 0; i < dadosMet.size(); i++ ) { //cria um novo objeto DadosMet chamado atual
			DadosMet atual = dadosMet.get(i);
			if(atual.getAno() == ano && atual.getMes() == mes) { //busca qual posi��o do Arraylist equivale ao desejado
				atual.buscaMaiorTemp(); //Executa a a��o, isso se repete nas outras a��es semelhantes
			}
			
		}
		
		return false;
	}

}
