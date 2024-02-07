package atividade1;

import java.util.Scanner;

public class CalculoDiferença {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner read = new Scanner(System.in)) {
			int n1;
			int n2;
			int n3;
			int n4;
			int resultadoFinal;
			
			
			System.out.println("Digite o primeiro numero: ");
			n1 = read.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = read.nextInt();
			System.out.println("Digite o terceiro numero: ");
			n3 = read.nextInt();
			System.out.println("Digite o quarto numero: ");
			n4 = read.nextInt();
			
			resultadoFinal = (n1 * n2) - (n3 * n4);
			
			System.out.println("O resultado final de sua operação foi:  " + resultadoFinal);
		}

	}

}
