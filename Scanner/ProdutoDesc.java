import java.util.Scanner;
public class ProdutoDesc {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double pro, desc;
		
		System.out.println("Calculador de desconto\n");
		System.out.println("Digite o preço do produto: ");
		pro = leia.nextDouble();
		System.out.println("Agora digite o desconto: ");
		desc = leia.nextDouble();
		pro = pro-(pro*desc/100);
		System.out.println("Esse será o preço final com o desconto: "+pro);
		
		
	}
}
