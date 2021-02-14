package dao;

// cria um array list estatico para nao perder o arraylist toda vez que o DAO é chamado

import java.util.ArrayList;

import modelos.DadosMet;

public class DaoArrayList implements Dao{
	
	private static ArrayList<DadosMet> bancoDados = new ArrayList<DadosMet>();

	@Override
	public void inserir(DadosMet dadosMet) { //adiciona ao final da arraylist
		bancoDados.add(dadosMet);
	}

	@Override
	public ArrayList<DadosMet> listar() { //retorna a lista
		return bancoDados;
	}

}
