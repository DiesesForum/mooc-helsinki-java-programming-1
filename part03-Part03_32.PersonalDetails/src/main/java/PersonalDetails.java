
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> birthyears = new ArrayList<>();
        String name = "";
        
        while(true){
            String str = scanner.nextLine();
            if(str.equals("")){
                break;
            }
            
            String[] arr = str.split(",");
            
            birthyears.add(Integer.valueOf(arr[1]));
            
            if(arr[0].length() > name.length()){
                name = arr[0];
            }
            
        }
        
        int sum = 0;
        
        for(int n : birthyears){
            sum += n;
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + sum * 1.0/ birthyears.size());


    }
}
