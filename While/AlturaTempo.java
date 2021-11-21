
public class AlturaTempo {
	public static void main(String[]args) {
		int i=0;
		double aJ=134, aP=145;
		
		while(aJ<=aP) {
			aJ=aJ+2.5;
			aP=aP+2;
			i++;
		}
		System.out.println("Demorou "+i+" anos para João ficar mais alto que Pedro");
	}
}
