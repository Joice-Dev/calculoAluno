package calculoAprovacao;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
			
		System.out.print("Digite a sua média: ");
		double media = ler.nextInt();
		
		System.out.print("Digite a quantidade de presenças: ");
		int quantidadePresenca = ler.nextInt();	
		
		System.out.print("Digite a quantidade total de aulas: ");
		int quantidadeAula = ler.nextInt();	
		
			
		
		double frequencia;
			
			frequencia = (quantidadePresenca * 100)/quantidadeAula;
			
		
			if (frequencia >= 75) {
				if (media >= 80) {
					System.out.println("Aprovado com "+frequencia+ " % de presença e média " +media);
					
				}else if((media >=40)&& (media < 80)) {
					System.out.println("Você está de recuperação!");
				}else {
					System.out.println("Você está reprovado por nota!");
				}
			}
			else {
				System.out.println("Você está reprovado por faltas!");
			}
		}

	}
