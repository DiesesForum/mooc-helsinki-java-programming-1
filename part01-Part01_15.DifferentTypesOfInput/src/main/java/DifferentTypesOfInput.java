 
import java.util.Scanner;
 
public class DifferentTypesOfInput {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double dbl = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean bol = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + dbl);
        System.out.println("You gave the boolean " + bol);
    }
}
 