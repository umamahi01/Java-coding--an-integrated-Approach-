import java.io.*;

public class IsChracterUorLcase{
    public static void main(String [] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("enter single character:-");
     char ch = (char) br.read();
     if(ch>=65 && ch<=90){
        System.out.print("upper case alphabet");
     }
     else if(ch>97 && ch<122){
        System.out.print("lower case alphabet");
     }
     else{
        System.out.print("special character");
     }
     
    }
}