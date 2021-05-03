import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        
        while(true){
            
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999){
                break;
            }else{
                numbers.add(num);
                if(num < smallest){
                    smallest = num;
                }
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for(int i = 0;i<numbers.size();i++){
            if(numbers.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
 
        
       
        
    }
}