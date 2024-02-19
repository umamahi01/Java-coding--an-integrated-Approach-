import java.io.*;
// import java.util.*;

public class Is_LeapyearOrNot {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter year:-");
        String str = br.readLine();
        int year = Integer.parseInt(str);
        // if the input year a century year then it must be divided by 400 if yes print leap year
        if(year%100 == 0 && year%400 == 0){
            System.out.println("leap year");

        }
        //if the input year is not a century year then it must be divided by 4 to prove true for being an leap year if yes print leap year
        else if (year%100 != 0 && year%4 == 0){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
