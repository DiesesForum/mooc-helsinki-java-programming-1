import java.util.Scanner;
 
public class AverageOfPositiveNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positives = 0;
        int numbers = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            
            if(num > 0){
                positives += num;
                numbers++;
            }
        }
        
        if(numbers == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(positives * 1.0  / numbers);
        }
 
    }
}
 