import java.util.Scanner;
public class Quest8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b=0, i, j, r=0;
		
		a = new int [10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor: ");
			a[i] = in.nextInt();
		}
		System.out.println();
		for(j=0; j<10; j++) {
			System.out.println("Digite o valor que será buscado: ");
			b = in.nextInt();
			for(i=0, j=0; i<10; i++, j++) {
				if(a[i] == b) {
					r = 1;
				}
			}
		}
 		System.out.println();
		if(r == 1) {
			System.out.println("O valor "+b+" está no A");
		}
		else{
			System.out.println("O valor "+b+" não está no A");
		}
	}
}