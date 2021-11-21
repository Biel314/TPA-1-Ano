import java.util.Scanner;

public class Bissextos {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int i=1, ai=0, af;
		
		System.out.println("Digite o ano inicial: ");
		ai = in.nextInt();
		
		System.out.println("Digite o ano final: ");
		af = in.nextInt();
		
		do {
			if(ai%4==0) {
				System.out.println(+ai+" é ano bissexto");
				ai++;
			}else 
				ai++;
		}while(ai<af);
	}
}