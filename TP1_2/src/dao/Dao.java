package dao;

import java.util.ArrayList;
import modelos.DadosMet;

public interface Dao { // cria a interface DAO = Data Access Object; Vi alguns sites falando
	//sobre o DAO e o interface, mas ainda nao consegui compreender totalmente
	
	void inserir(DadosMet dadosMet); // inserir dados no Arraylist
	
	ArrayList<DadosMet> listar(); // retorna o Arraylist;
	
}
