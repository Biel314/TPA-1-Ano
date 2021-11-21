import java.util.Scanner;
public class VeiculoIpva {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double pVeiculo, ipva;
		
		System.out.println("Calculador de IPVA\n");
		System.out.println("Digite o preço do veículo: ");
		pVeiculo = in.nextDouble();
		ipva = pVeiculo*4/100;
		System.out.println("O valor do IPVA de um carro que custa R$"+pVeiculo+" é de R$"+ipva);
	}
}
