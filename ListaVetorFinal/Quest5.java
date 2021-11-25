import java.util.Scanner;

public class Quest5 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a[], b[], i, r=1, n;

			a = new int [15];
			b = new int [15];
			
			for(i=0; i<15; i++) {
				System.out.println("Digite o "+(i+1)+"o valor do fatorial: ");
				a[i] = in.nextInt();
				r=1;
				for(n=a[i]; n>1; n--) {
					r = r*n;
					b[i] = r;
				}
			}
			for(i=0; i<15; i++) {
				
				if(b[i]!=0) {
					System.out.println("O fatorial de "+a[i]+" é: "+b[i]);
				}
				else {
					System.out.println("O fatorial de "+a[i]+" é 1");
			}
		}
	}
}