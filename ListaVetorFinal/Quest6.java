import java.util.Scanner;

public class Quest6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b[], c[], i, j, k=0;
		boolean encontrado;
		
		a = new int[10];
		b = new int[10];
		c = new int[10];
		
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
		} 
		System.out.println();
		for (j=0; j<10; j++) {
			System.out.println("Digite o "+(j+1)+"o valor do vetor B: ");
			b[j] = in.nextInt();
		}
		for (i=0; i<10; i++) {
			encontrado = false;
			for (j=0; j<10; j++) {
			if (a[i]==b[j]) {
				encontrado = true;
				}
			}
			if (encontrado == true) {
				c[k]=a[i];
				System.out.println("A interseção de A e B é: "+c[k]);
				k++;
			}
		}
	}
}