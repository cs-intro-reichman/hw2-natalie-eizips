// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    
		int num_runs = Integer.parseInt(args[0]);
		int less_than = 0;
		int greater_than = 0;
		
		for (int i = 0; i < num_runs; i++) {
			double random = Math.random();
			if (random <= 0.5) {
				less_than ++;
			}
			else {
				greater_than ++;
			}
		}

		System.out.println("> 0.5: " + greater_than + " times");
		System.out.println("<= 0.5: " + less_than + " times");

		if (less_than != 0){
			double ratio = (double) greater_than/ (double) less_than;
			System.out.println("Ratio: " + ratio);
		}
	}
}
