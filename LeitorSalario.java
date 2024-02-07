package atividade1;

import java.util.Scanner;

public class LeitorSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner read = new Scanner(System.in)) {
			float salario;
			float abono;
			float salarioFinal;
			
			System.out.printf("Digite seu salario:\n");
			salario = read.nextFloat();
			System.out.printf("Digite o abono:\n");
			abono = read.nextFloat();
			
			salarioFinal = abono + salario;
			System.out.printf("Seu salario final é: " + salarioFinal);
		}
		
		
		
		

	}

}
