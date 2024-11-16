public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int add_time = Integer.parseInt(args[1]);

        int total_minutes = (hours * 60) + minutes + add_time;
        int total_hours = total_minutes / 60;
        int new_hours = total_hours % 24;
        int new_minutes = total_minutes - (total_hours * 60);

        if (new_hours <10) {
            System.out.print("0");
        }

        System.out.print(new_hours + ":");
      
        if (new_minutes < 10) {
            System.out.print("0");
        }

        System.out.println(new_minutes);
    }
}
