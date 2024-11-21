// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            int count = Integer.parseInt(args[1]);
            String letters = "AEFHILMNORSX";

            for (int i = 0; i < word.length(); i++) {
                System.out.print("Give me a");
                if (letters.indexOf(word.charAt(i)) == -1){
                        System.out.print("  ");
                }
                else {
                        System.out.print("n ");
                } 
                System.out.print(word.charAt(i) + ": ");
                System.out.println(word.charAt(i) + "!");
            }

            System.out.println("What does that spell?");

            for (int i = 0; i < count; i++) {
                System.out.println(word + "!!!");
            }
        }
}
