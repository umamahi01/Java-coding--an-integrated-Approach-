import java.io.*;

public class CheckAcharIsAlphabetorNot {
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter single character:-");
        char ch = (char) br.read();
        // 65 - 90 => A-Z and 97-122 => a-z in unicode/ascii character system
        if((ch>= 65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println("the char is alphabet");
        }
        else{
            System.out.println("the character is not an alphabet");
        }

    }
}
