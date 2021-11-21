import java.util.*;
public class nomeIdade {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		
		String nome, nomeVelho, nomeNovo;
		float idade, idadeVelho, idadeNovo;
		
		System.out.println("Escreva o nome da primeira pessoa: ");
		nome = in.next();
		System.out.println("Escreva a idade da primeira pessoa: ");
		idade = in.nextFloat();
		
		idadeVelho = idade;
		idadeNovo = idade;
		nomeVelho = nome;
		nomeNovo = nome;
	
		System.out.println("Escreva o nome da segunda pessoa: ");
		nome = in.next();
		System.out.println("Escreva a idade da segunda pessoa: ");
		idade = in.nextFloat();
		
		if (idade>idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
			
		} else if (idade<idadeNovo) {
			idadeNovo=idade;
			nomeNovo=nome;
		}	
		System.out.println("Escreva o nome da terceira pessoa: ");
		nome = in.next();
		System.out.println("Escreva a idade da terceira pessoa: ");
		idade = in.nextFloat();
		
		if (idade>idadeVelho) {
			idadeVelho=idade;
			nomeVelho=nome;
			
		} else if (idade<idadeNovo) {
			idadeNovo=idade;
			nomeNovo=nome;
		}	
		System.out.println("Escreva o nome da quarta pessoa: ");
		nome = in.next();
		System.out.println("Escreva a idade da quarta pessoa: ");
		idade = in.nextFloat();
		
		if (idade>idadeVelho) {
			idadeVelho=idade;
			nomeVelho=nome;
			
		} else if (idade<idadeNovo) {
			idadeNovo=idade;	
			nomeNovo=nome;	
		}	
		System.out.println("Escreva o nome da quinta pessoa: ");
		nome = in.next();
		System.out.println("Escreva a idade da quarta pessoa: ");
		idade = in.nextFloat();
		
		if (idade>idadeVelho) {
			idadeVelho=idade;
			nomeVelho=nome;
			
		} else if (idade<idadeNovo) {
			idadeNovo=idade;
			nomeNovo=nome;	
		}	
		System.out.println("A pessoa mais nova é a(o): " +nomeNovo+ " e sua idade é: " +idadeNovo+ " e a pessoa mais velha é a(o)" +nomeVelho+ " e sua idade é: " +idadeVelho);
		
	}	
}