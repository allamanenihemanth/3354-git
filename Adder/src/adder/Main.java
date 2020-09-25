package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide at least two numbers to add");
        } catch(NumberFormatException exception) {
    System.out.println("Please provide numbers");
        
    }

    private static int addArguments(String[] args) {
          if (args[1] == "-") {
            return -1*(Integer.valueOf(args[1]) + Integer.valueOf(args[2]))
        } else
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
}
