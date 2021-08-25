package view;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		// Função para achar o tempo inicial de uma execução
		long tempo1 = System.currentTimeMillis();

		// Função para imprimir algo
		System.out.println("Ola Mundo");

		// Função nesse caso para imprimir a variavel tempo1
		System.out.println("Tempo Inicial = " + tempo1);

		// Função para achar o tempo inicial de uma execução
		long tempo2 = System.currentTimeMillis();

		// Função nesse caso para imprimir a variavel tempo2
		System.out.println("Tempo Final = " + tempo2);

		// Função nesse caso para imprimir a variavel tempo2 - tempo1
		System.out.println(tempo2 - tempo1);

	}
}
