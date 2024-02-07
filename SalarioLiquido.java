package atividade1;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in)) {
			float salarioBruto;
			float adicionalNoturno;
			float horasExtras;
			float descontos;
			float salarioLiquido;
			
			System.out.printf("Digite seu Salario bruto: ");
			salarioBruto = read.nextFloat();
			System.out.printf("Digite seu adicional noturno: ");
			adicionalNoturno = read.nextFloat();
			System.out.printf("Digite suas horas extras: ");
			horasExtras = read.nextFloat();
			System.out.printf("Digite os descontos: ");
			descontos = read.nextFloat();
			
			salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
			
			System.out.printf("Seu salario liquido é:  " + salarioLiquido);
		}
		
		
		

	}

}
