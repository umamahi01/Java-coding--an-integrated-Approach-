//takes month number to print month name
//
import java.io.*;

public class MonthName {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("enter month number:-");
           int monthinput = Integer.parseInt(br.readLine());
           if(monthinput == 1){
            System.out.println("January");
           }
           else if(monthinput == 2){
            System.out.println("Febuary");
           }
           else if(monthinput == 3){
            System.out.println("March");
           }
           else if(monthinput == 4){
            System.out.println("April");
           }
           else if(monthinput == 5 ){
            System.out.println("May");
           }
           else if(monthinput == 6){
            System.out.println("June");
           }
           else if(monthinput == 7){
            System.out.println("July");
           }
           else if(monthinput == 8){
            System.out.println("August");
           }
           else if(monthinput == 9){
            System.out.println("September");
           }
           else if(monthinput == 10){
            System.out.println("October");
           }
           else if(monthinput ==11 ){
            System.out.println("November");
           }
           else if(monthinput == 12){
            System.out.println("December");
           }
           else{
            System.out.println("enter number between 1-12..");
           }
    }
    
}
