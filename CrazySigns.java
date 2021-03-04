import java.util.Scanner; 
public class CrazySigns {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the number of sides to your polygon:");
		int n = input.nextInt(); 
		
		System.out.println ("Enter the length of each side:");
		double s = input.nextInt(); 
		
		System.out.println ("Enter the string you would like on your sign:"); 
		input.nextLine(); 
		String sign = input.nextLine(); 
		
		double area = (n * s * s) / (4 * (Math.tan(Math.PI / n )));
		double CostPerArea = area * 2.78;
        int signLength = 0; 
		int i; 
		char c = 0; 
		for (i = 0; i < sign.length(); i++) {
			c = sign.charAt(i);
			if (Character.isLetter(c)) {
			signLength++; 
		    } 
		}
        double CostPerChar = signLength * 1.64; 
		double TotalCost = CostPerArea + CostPerChar; 
		System.out.printf("$%.2f", TotalCost);
		System.out.println ();
		System.out.println ("Would you like to create another sign? Enter no to exit.");
		input.nextLine(); 
		String answer = input.nextLine().trim(); 
		
		while (!answer.equals("no")) {
			
		System.out.println ("Enter the number of sides to your polygon:");
		n = input.nextInt(); 
		
		System.out.println ("Enter the length of each side:");
		s = input.nextInt(); 
		
		System.out.println ("Enter the string you would like on your sign:"); 
		input.nextLine(); 
		sign = input.nextLine(); 
		
		area = (n * s * s) / (4 * (Math.tan(Math.PI / n )));
		CostPerArea = area * 2.78;
        signLength = 0;  
		c = 0; 
		for (i = 0; i < sign.length(); i++) {
			c = sign.charAt(i);
			if (Character.isLetter(c)) {
			signLength++; 
		    } 
		}
        CostPerChar = signLength * 1.64; 
		TotalCost = CostPerArea + CostPerChar;
		
		System.out.printf("$%.2f", TotalCost);
		System.out.println ();
		
		System.out.println ("Would you like to create another sign? Enter no to exit."); 
		answer = input.nextLine().trim();
		}
	}
}