import java.util.*;
public class Calcuidade {
	public static void main (String args []) {
	Scanner in = new Scanner (System.in);
	
	int an, aa, idade;
	
	System.out.println("Escreva o ano de nascimento: ");
	an = in.nextInt();
		
	System.out.println("Escreva o ano atual: ");
	aa = in.nextInt();
		
	idade=aa-an;
	System.out.println("A sua idade é:"+idade);
	
	if(idade<10) {
		System.out.println("Criança");	
	
	} else if (idade<18) {
		System.out.print("Adolescente");
		
	} else if (idade<60) {
		System.out.println("Adulto");
		
	} else {
		in.close();
		System.out.println("Idoso");

		}
	}
	
}
