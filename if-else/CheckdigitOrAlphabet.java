import java.io.*;

public class CheckdigitOrAlphabet{
    public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("enter any character:-");
         char ch = (char) br.read();

         if(ch >='a' && ch<= 'z' || ch>='A' && ch<='Z'){
            System.out.print("it is a character");
         }
         else if(ch >='0'&& ch<='9'){
            System.out.println("it is a number");
         }
         else{
            System.out.print("it is a special character");
         }
    }
}
//