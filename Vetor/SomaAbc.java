import java.util.Scanner;

public class SomaAbc {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i;
		
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		}
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor B: ");
			b[i] = in.nextInt();
			c[i] = a[i]+b[i];
		}
		System.out.println();
		for(i=0; i<10; i++) {
			System.out.println("Apresente o "+(i+1)+"o valor do vetor C: "+c[i]);
		}
	}
}
