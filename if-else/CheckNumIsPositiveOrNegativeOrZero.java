import java.io.*;


public class CheckNumIsPositiveOrNegativeOrZero {
    public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("enter number:-");
       int number = Integer.parseInt(br.readLine());
          if(number>0){
            System.out.print("number is positive");
          }
          else if(number<0){
            System.out.print("negative number");
          }
          else{
            System.out.print("equals to zero");
          }
    }
}
