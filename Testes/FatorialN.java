import java.util.Scanner;

public class FatorialN {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int r=1, n;
		
		System.out.println("Digite o numero inteiro: ");
		n = in.nextInt();
		while(n>0) {
			r=r*n;
			n--;
		}
		System.out.println("O fatorial do numero escolhido é: "+r);
	}
}
