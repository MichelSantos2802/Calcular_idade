package Programa_idade_nascimento;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class CalcularIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu nascimento:");
		int anoNascimento = entrada.nextInt();
		
		int anoAtual = LocalDate.now().getYear();
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println("Sua idade é: " + idade + " anos");
		
		if (idade>=18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
		entrada.close();

	}

}
