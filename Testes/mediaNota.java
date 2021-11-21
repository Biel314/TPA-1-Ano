import java.util.*;
public class mediaNota {
	public static void main (String args []) {
	Scanner in = new Scanner (System.in);
	
	double n1, n2, ne, media, mediaNova;
	
	System.out.println("Escreva a primeira nota: ");
	n1 = in.nextDouble();
	
	System.out.println("Escreva a segunda nota: ");
	n2 = in.nextDouble();
	
	media=(n1+n2)/2;
	
	if (media>=6) {
		System.out.println("Aprovado");
	
	} else if (media<3) {
		System.out.println("Reprovado");
	
	} else if (media>=3) {
		
	System.out.println("Escreva a nota do exame: ");
	ne = in.nextDouble(); 
	
	mediaNova=(ne+media)/2; 
	
	 if (mediaNova>=6) {
		System.out.println("Aprovado");
		
	} else {
		System.out.println("Reprovado"); 
			}
		}
	
	
	
	}
}
