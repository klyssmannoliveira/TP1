package modelos;

//// Objeto dados Met

public class DadosMet {
	
	private int ano, mes, quantidade;
	private int dia[] = new int[quantidade];
	private double temperatura[] = new double[quantidade];
	
/*	public DadosMet(int ano, int mes) {
		this.ano = ano;
		this.mes = mes;
	}*/

	public DadosMet(int ano, int mes, int quantidade, int[] dia, double[] temperatura) {
		this.ano = ano;
		this.mes = mes;
		this.quantidade = quantidade;
		this.dia = dia;
		this.temperatura = temperatura;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int[] getDia() {
		return dia;
	}

	public void setDia(int[] dia) {
		this.dia = dia;
	}

	public double[] getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double[] temperatura) {
		this.temperatura = temperatura;
	}
	
//////////////////////////////////////////////// Calculos
	
	public void buscaMenorTemp() { // Busca e imprime a menor temperatura
		int i=0;
		double menorTemp = temperatura[i];
		for(i=1; i<quantidade; i++) {
			if( temperatura[i] <= menorTemp ) {
				menorTemp = temperatura[i];
			}
		}
		
		System.out.printf("A menor temperatura é de %.2f ºC no(s) dia(s):\n", menorTemp);
		for(i=0; i<quantidade; i++) {
			if( temperatura[i] == menorTemp) {
				System.out.println(dia[i] + "/" + mes + "/" + ano);
			}
		}
		
	}
	
	public void buscaMaiorTemp() { // Busca e imprime a maior temperatura
		int i=0;
		double maiorTemp = temperatura[i];
		for(i=1; i<quantidade; i++) {
			if( temperatura[i] >= maiorTemp ) {
				maiorTemp = temperatura[i];
			}
		}
		
		System.out.printf("A maior temperatura é de %.2f ºC no(s) dia(s):\n", maiorTemp);
		for(i=0; i<quantidade; i++) {
			if( temperatura[i] == maiorTemp) {
				System.out.println(dia[i] + "/" + mes + "/" + ano);
			}
		}
		
	}
	
	public void mediaTemp() { // calcula a media das temperaturas no mês
		double media, soma = 0;
		int contador=0;
		for(int i=0; i<quantidade; i++) {
			soma = soma + temperatura[i];
			contador++;
		}
		media = soma/contador;
		
		System.out.printf("A média de Temperatura do mês " + mes +
				" do ano de " + ano + " é de %.2f ºC\n", media);
	}
	
	public void relatorio() { //Relatório
		mediaTemp();
		buscaMenorTemp();
		buscaMaiorTemp();
		
	}
	

}
