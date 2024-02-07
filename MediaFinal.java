package atividade1;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner read = new Scanner(System.in)) {
			float nota1f;
			float nota2f;
			float nota3f;
			float nota4f;
			float mediaFinal;

			System.out.printf("Digite sua primeira nota: ");
			nota1f = read.nextFloat();
			System.out.printf("Digite sua segunda nota: ");
			nota2f = read.nextFloat();
			System.out.printf("Digite sua terceira nota: ");
			nota3f = read.nextFloat();
			System.out.printf("Digite sua quarta nota: ");
			nota4f = read.nextFloat();
			
			mediaFinal = (nota1f + nota2f + nota3f + nota4f) /4;

			System.out.printf("Sua média final foi:  " + mediaFinal);
		}
	}

}
