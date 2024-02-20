//input week number abd get week day
import java.io.*;
public class WeekDay {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter day 1-7:-");
        int number = Integer.parseInt(br.readLine());
        if(number == 1){
           System.out.println("Sunday");
        }
        else if(number == 2){
          System.out.println("Monday");
        }
        else if(number == 3){
          System.out.println("Tuesday");
        }else if(number == 4){
            System.out.println("wednesday");

        }
        else if (number == 5){
            System.out.println("thursday");

        }
        else if(number == 6){
            System.out.println("Friday");

        }
        else if(number == 7){
            System.out.println("Saturday");
        }
        else{
            System.out.println("no day");
        }

        

    }
}
//
