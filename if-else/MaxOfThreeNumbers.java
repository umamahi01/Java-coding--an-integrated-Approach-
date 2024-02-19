import java.io.*;
public class MaxOfThreeNumbers{
  public static void main(String[] args) throws IOException{
    BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter num1:-");
     
      int num1 = Integer.parseInt(br.readLine());
      System.out.println("enter num2:-");
      int num2 = Integer.parseInt(br.readLine());
      System.out.println("enter num3:-");
      int num3 = Integer.parseInt(br.readLine());

      if(num1>num2 && num1>num3){
        System.out.print("num1 is maximum");
      }
      else if(num2>num3 ){
        System.out.print("num2 is maximum");
      }
      else{
        System.out.print("num3 ismaximum");
      }

  }
}