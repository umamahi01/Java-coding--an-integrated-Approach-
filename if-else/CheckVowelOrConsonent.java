import java.io.*;
public class CheckVowelOrConsonent {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter single character:-");
        char ch = (char) br.read();
        if(ch== 'a'|| ch == 'e'||ch == 'i'||ch=='o'|| ch == 'u'){
            System.out.println("it is vowel");
        }
        else{
            System.out.println("it is consonant");
        }

    }
}

