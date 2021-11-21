import java.util.Scanner;
public class Joao {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("\nEsse é o primeiro programa que eu faço assim, ficou bom? Responda com sim ou não.\nR: ");
		
		String resp1 = entrada.next();
		
		if (resp1.equalsIgnoreCase("sim") || resp1.equalsIgnoreCase("s")) {
			
			System.out.print("\nObrigado.");
		}
		else if (resp1.equalsIgnoreCase("não") || resp1.equalsIgnoreCase("n")) {
			
			System.out.print("\nPode me dizer onde eu deveria melhorar?\nR:");
			
			String resp2 = entrada.next();
			
			if (resp2.equalsIgnoreCase("sim") || resp2.equalsIgnoreCase("s")) { 
				System.out.print("\nBeleza, diz aí: \nR: ");
				
				String resp3 = entrada.next();
				
				System.out.print("\nBeleza, vou pensar nisso.");
				
			}
			else if (resp2.equalsIgnoreCase("não") || resp2.equalsIgnoreCase("n")) {
				System.out.print("Ah, ok, então...");
				
			}
			else {
				System.out.println("Poxa, responde aí,");
			
			}
		}
		
		
	}

}
