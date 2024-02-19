//* this pogram check s the given number is divisible by 5 and 11 or not */
import java.io.*;
public class Divisibiltycheck {
     public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter number:-");
       int input = Integer.parseInt(br.readLine());
       if(input%5 == 0 && input%11 == 0){
        System.out.println("the given number is divisible by both 5 and 11");
       }
       else{
        System.out.println("the given number is not divisible by 5 and 11");
       }
       
     }
}
