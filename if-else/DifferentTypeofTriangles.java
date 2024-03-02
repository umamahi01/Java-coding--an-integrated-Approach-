import java.io.*;
import java.util.*;

public class DifferentTypeofTriangles {
    public static void main(String[] args) throws IOException{
        System.out.print("enter three sides in same line by comma as seperator:- ");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str = br.readLine();
         StringTokenizer sr = new StringTokenizer(str,",");
         String s1 = sr.nextToken();
         String s2 = sr.nextToken();
         String s3 = sr.nextToken();

         s1 = s1.trim();
         s2 = s2.trim();
         s3 = s3.trim();

         int sideOne = Integer.parseInt(s1);
         int sideTwo = Integer.parseInt(s2);
         int sideThree = Integer.parseInt(s3);
         if(sideOne==sideTwo&& sideTwo==sideThree&& sideOne==sideThree){
         System.out.println("its an  equilateral  triangle");
         }
         else if(sideOne==sideTwo||sideTwo==sideThree||sideOne==sideThree){
            System.out.println("its an isoceles triangle");
         }
         else{
            System.out.println("its an scalen triangle");
         }
    }
}
