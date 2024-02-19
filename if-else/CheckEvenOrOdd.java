import java.io.*;
public class CheckEvenOrOdd {
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter Num:-");
        int inputNum = Integer.parseInt(br.readLine());
        if(inputNum%2 == 0){
            System.out.println("it is even number");
        }
        else{
            System.out.println(" it is odd number");
        }

    }
}
