import java.io.*;
// import java.util.*;

public class Is_LeapyearOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter year:-");
        String str = br.readLine();
        int year = Integer.parseInt(str);
        if(year%100 == 0 && year%400 == 0){
            System.out.println("leap year");

        }
        else if (year%100 != 0 && year%4 == 0){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
