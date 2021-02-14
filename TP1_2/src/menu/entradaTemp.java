package menu;

import java.util.Scanner;

import dao.Dao;
import dao.DaoArrayList;
import modelos.DadosMet;

public class entradaTemp extends ItemDeMenu {

	@Override
	public String getDescricao() {
		return "Entrada das temperaturas";
	}

	@Override
	public boolean executar() {
		Scanner ler  = new Scanner(System.in);
		
		System.out.print("Ano: "); //ano
		int ano = ler.nextInt();
		
		System.out.print("Mes: ");// mes
		int mes = ler.nextInt();
		
		int quantidade = 31; //cria um vetor dia e temperatura inicialmente com 31 posições;
		
		if( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ||mes == 12 ) {
			quantidade = 31;
		}
		else if( mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
			quantidade = 30;
		}
		else if( mes == 2 ) {
			if(ano % 4 != 0) {
				quantidade = 28;
			}
			else {
				quantidade = 29;
			}
		}
		
		int dia[] = new int[quantidade];
		double temperatura[] = new double[quantidade];
		
		for( int i = 0; i<quantidade; i++) { // lê as temperaturas e dias
			System.out.print("Insira a Temperatura do dia " + (i+1) + ": ");
			dia[i] = i+1;
			temperatura[i] = ler.nextDouble();
		}
		
		// Abaixo, irá criar um novo objeto chamado DadosMet com as informações inseridas pelo usuário;
		DadosMet dadosMet = new DadosMet(ano, mes, quantidade, dia, temperatura);
		
		// inicia a interface DAO para que esse objeto criado seja adicionado no Arraylist e assim consiga ser buscado futuramente
		Dao dao = new DaoArrayList();
		dao.inserir(dadosMet);
		
		// Mensagem de operação bem sucedida
		System.out.println("As temperaturas foram cadastradas com sucesso!");
		
		return false;
	}

}
