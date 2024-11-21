// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int terms = Integer.parseInt(args[0]);
		double numerator = 1;
		double denominator = 1;
		double sum = 0;

		for (int i = 0; i < terms; i++){
			sum += numerator/denominator;
			denominator += 2;
			numerator *= -1;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum*4);
	}
}
