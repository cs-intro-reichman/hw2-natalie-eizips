// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int term;

		if (mode == 'v'){
			System.out.println("1 4 2 1 (1)");
		}

		for (int i = 2; i <= num; i++){	
			term = i;
			while(term != 1){
				if (mode == 'v'){
					System.out.print(term + " ");
				}
				if (term % 2 == 0){
					term /= 2;
				}
				else {
					term = (3 * term) + 1;
				}
			}
			if (mode == 'v'){
				System.out.println("1 (" + i + ")");
			}
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");

	}
}
