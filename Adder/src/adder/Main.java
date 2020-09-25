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
<<<<<<< HEAD
        int sum=Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        for(int i=2;i<args.length;i++)
            sum+=Integer.parseInt(args[i]);
        return sum;
            return -1*(Integer.valueOf(args[1]) + Integer.valueOf(args[2]))
        } else
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
>>>>>>> experimental-changes
}
