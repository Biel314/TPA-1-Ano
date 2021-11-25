import java.util.Scanner;

public class MediaInteiro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], m=0, i;
		
		a = new int[10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A: ");
			a[i] = in.nextInt();
			m=m+a[i];
		}
		m=m/10;
		System.out.println("A média é: "+m);
	}
}