import java.io.*;
import java.util.*;
// import java.lang.*;

public class GreaterNumber{
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter num1 and num2 seperated by comma(,):-");
        String str = br.readLine();
        StringTokenizer stw = new StringTokenizer(str,",");
        String s1 = stw.nextToken();
        String s2 = stw.nextToken();
        s1 = s1.trim();
        s2 = s2.trim();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        if(num1> num2){
            System.out.println("maximum is num1= "+num1);
        
        }
        else if(num1 == num2){
            System.out.println("both are equal");
        }
        else{
            System.out.println("maximum is num2 = "+num2);
        }

    }
}