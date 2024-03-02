import java.io.*;
import java.util.StringTokenizer;

public class TriangleOrNotWithAngles {
    public static void main(String[] args) throws IOException{
        //create buffered Reader object take input from inputstream key board
        System.out.print("enter three angles with , as sperator:");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //taking input as string type using br object and readline method of buffered reader
          String str = br.readLine();
        //create stringtokenizer object to read inputs a tokens
        StringTokenizer sr = new StringTokenizer(str,",");
        String s1 = sr.nextToken();
        String s2 = sr.nextToken();
        String s3 = sr.nextToken();

        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        int AngleOne = Integer.parseInt(s1);
        int AngleTwo =Integer.parseInt(s2);
        int AngleThree = Integer.parseInt(s3);

        int result = AngleOne + AngleTwo+ AngleThree;

        if(result == 180 && AngleOne>0 && AngleTwo>0 && AngleThree>0){
            System.out.println("it can form a Triangle");

        }
        else{
            System.out.print("it cannot form a Triangle");
        }


        
    }
    
}
