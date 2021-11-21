import java.util.Scanner;
public class MetrosConvertor {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double m, km;
		
		System.out.println("Conversor de metros em quilômetros\n");
		System.out.println("Digite a quantidade de metros: ");
		m = ler.nextDouble();
		km = m/1000;
		System.out.println( "Metros convertidos em quilometros: "+km);
		
	}
}
