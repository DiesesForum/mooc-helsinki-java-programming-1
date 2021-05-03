import java.util.Scanner;
 
public class AverageOfNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numbers = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0){
                break;
            }else{
                numbers++;
                sum += num;
            }
            
           
        }
        
        double avg = 1.0 * sum / numbers;
        
        System.out.println("Average of the numbers: " + avg);
    }
}
 