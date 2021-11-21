import java.util.*;
public class Economic {
	public static void main (String args []) {
	Scanner in = new Scanner (System.in);
		
	double dis, comb, gasto;
	
	System.out.println("Escreva a capacidade em litros: ");
	comb = in.nextDouble();
			
	System.out.println("Escreva a distância em quilometros: ");
	dis = in.nextDouble();
	
	gasto=dis/comb;
	
	if (gasto>=10) {
		System.out.println("É Economico");
		
	} else {
		in.close();
		System.out.println("Não é economico");
		
		}
	}
}
