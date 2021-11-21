import java.util.Scanner;

public class MaiorMenorN {
	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int maior, menor, n, nmro;
		
		System.out.println("Digite a quantidade de números: ");
		n = in.nextInt();
		
		if (n!=0) {
			System.out.println("Digite um valor: ");
			nmro = in.nextInt();
			maior=nmro;
			n--;
			do {
				System.out.println("Digite um valor: ");
				nmro = in.nextInt();
				if (nmro>maior) {
					maior=nmro;
				}
				n--;
				if (n==0) {
					System.out.println("O número maior é: "+maior);
					System.out.println("Digite a quantidade de números: ");
					n = in.nextInt();
					maior=0;
				}
			}while(n!=0);
		}
	}
}
