package view;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		// Fun��o para achar o tempo inicial de uma execu��o
		long tempo1 = System.currentTimeMillis();

		// Fun��o para imprimir algo
		System.out.println("Ola Mundo");

		// Fun��o nesse caso para imprimir a variavel tempo1
		System.out.println("Tempo Inicial = " + tempo1);

		// Fun��o para achar o tempo inicial de uma execu��o
		long tempo2 = System.currentTimeMillis();

		// Fun��o nesse caso para imprimir a variavel tempo2
		System.out.println("Tempo Final = " + tempo2);

		// Fun��o nesse caso para imprimir a variavel tempo2 - tempo1
		System.out.println(tempo2 - tempo1);

	}
}
