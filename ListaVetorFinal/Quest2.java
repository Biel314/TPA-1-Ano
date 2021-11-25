import java.util.Scanner;
public class Quest2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r, i, a[];
		
		a = new int[5];
		
		for(int j=0; j<5; j++) {	
			System.out.println("Insira o valor "+(j+1)+"o da tabuada: ");
			a[j] = in.nextInt();
			for(i=1; i<=10; i++) {
				r = a[j]*i;
				System.out.println(a[j]+"*"+i+"="+r);
			}
		}
	}
}