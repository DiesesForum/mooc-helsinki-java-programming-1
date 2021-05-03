import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == -1){
                break;
            }else{
                numbers.add(num);
            }
        }
        
        int sum = 0;
        
        for(int num : numbers){
            sum += num;
        }
        System.out.println("Average: " + sum * 1.0 / numbers.size());
        
    }
}