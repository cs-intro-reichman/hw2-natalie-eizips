// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int term;
		int count;

		if (mode == 'v'){
			System.out.println("1 4 2 1 (4)");
		}
		for (int i = 2; i <= num; i++){	
			term = i;
			count = 1;
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
				count ++;
			}
			if (mode == 'v'){
				System.out.println("1 (" + count + ")");
			}
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");

	}
}
