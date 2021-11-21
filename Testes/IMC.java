import java.util.*;
public class IMC {
	public static void main (String args []) {
	Scanner in = new Scanner (System.in);
	
	double h, kg, IMC;
	
	System.out.println("Escreva a altura: ");
	h = in.nextDouble();
	
	System.out.println("Escreva o peso: ");
	kg = in.nextDouble();
	
	IMC=kg/(h*h);
	System.out.println("IMC: "+IMC);
	
	if(IMC<=18.5) {
		System.out.println("excesso de magreza");
				
	} else if (IMC<25) {
		System.out.println("peso normal");
		
	} else if (IMC<30) {
		System.out.println("excesso de peso");
		
	} else if (IMC<35) {
		System.out.println("obesidade grau 1");
		
	} else if (IMC<40) {
		System.out.println("obesidade grau 2");
		
	} else {
		System.out.println("obesidade grau 3");
		
	
		
		
		}
		in.close();
	}
}
