import java.util.Scanner;

import dao.Dao;
import dao.DaoArrayList;
import menu.ItemDeMenu;
import menu.Sair;
import menu.buscaMaiorTemp;
import menu.buscaMenorTemp;
import menu.entradaTemp;
import menu.mediaTep;
import menu.relatorio;
import modelos.DadosMet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		inicializa();
		
		ItemDeMenu[] principal = new ItemDeMenu[] { // lista do  menu
				new entradaTemp(),
				new mediaTep(),
				new buscaMenorTemp(),
				new buscaMaiorTemp(),
				new relatorio(),
				new Sair()
		};
		
		boolean sair = false;
		
		do { // Aqui eu utilizei o do-while pois eu não tinha o costume de utilizar
			System.out.println("");
			for(int i = 0; i  < principal.length; i++) { // imprime o menu e opcoes
				System.out.println("(" + i + ") " + principal[i].getDescricao());
			}
			System.out.print("Escolha a sua opção: ");
			int opcao = Integer.parseInt(ler.nextLine());
			
			sair = principal[opcao].executar();
		} while(!sair); // quando sair == true, sai do laço
	}
	
	public static void inicializa() {
		int ano = 2020;
		int mes = 1;
		int quantidade = 31;
		int dia[] = new int[quantidade];
		double temperatura[] = new double[quantidade];
		
		int variavelTemp = 9;
		for( int i = 0; i<quantidade; i++) { // lê as temperaturas e dias
			dia[i] = i+1;
			temperatura[i] = variavelTemp;
			variavelTemp++;
		}
		DadosMet dadosMet = new DadosMet(ano, mes, quantidade, dia, temperatura);
		Dao dao = new DaoArrayList();
		dao.inserir(dadosMet);
	}

}
