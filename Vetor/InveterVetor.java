import java.util.Scanner;

public class InveterVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], i;
		
		a = new int[10];
		b = new int[10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
			b[9-i]=a[i];
		}
		System.out.println();
		for(i=0; i<10; i++) {
			System.out.println(b[i]);
		}
	}
}