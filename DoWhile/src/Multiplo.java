
public class Multiplo {
	public static void main(String args[]) {
		int i=1;
		
		do {
			if (i%10==0) {
				System.out.println(i+ " é múltiplo de 10");
			}
			i++;
		}while (i<=300);
	}
}