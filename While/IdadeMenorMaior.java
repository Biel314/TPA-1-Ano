import java.util.Scanner;

public class IdadeMenorMaior {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i=1, menor=0, maior=0, idade;
		
		while(i<11) {
			System.out.println("Escreva a idade: ");
			idade = in.nextInt();
			if(idade<18) {
				System.out.println("Este aluno é menor de idade");
				menor=menor+1;
			} else {
				System.out.println("Este aluno é maior de idade");
				maior=maior+1;
			}  
			i++;
		}
		System.out.println("Tem "+menor+" alunos menores");
		System.out.println("e "+maior+" alunos maiores de idade");
	}
}
