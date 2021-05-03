import java.util.Scanner;
 
public class Factorial {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fatorial = 1;
        
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int i = 1;i<=number;i++){
            fatorial *= i;
        }
        
        System.out.println("Factorial: " + fatorial);
 
    }
}