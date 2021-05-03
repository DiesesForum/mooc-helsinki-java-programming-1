
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        String name = "";
        
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }
            
            String[] arr = str.split(",");
            
            if(Integer.valueOf(arr[1]) > age){
                name = arr[0];
                age = Integer.valueOf(arr[1]);
            }
            
        }
        
        System.out.println("Name of the oldest: " + name);


    }
}
