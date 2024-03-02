//Roots of an Qudratic Equation
/** 1. real and different               ==>  d>0 where d(discrimenent) = b*b-4*a*c >0  root1= -b+sqrt(d)/2*a root2 = -b-sqrt(d)/2*a
 *  2. real and equal                   ==>  d=0 root1=root2=-b/2*a
 *  3. complex/imaginary and different  ==>  d<0 real = -b/2*a imaginary = sqrt(-d)/2*a root1 = real+i imaginary root2 = real-i imaginary
*/
import java.io.*;
import java.util.*;


public class RootsOfQE {

    public static void main(String[] args) throws IOException{
        System.out.print("enter three Numbers with some space between each:-  ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer sr = new StringTokenizer(str," ");
        String s1 = sr.nextToken();
        String s2 = sr.nextToken();
        String s3 = sr.nextToken();
         s1 = s1.trim();
         s2 = s2.trim();
         s3 = s3.trim();
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = Double.parseDouble(s3);
      double discriminant , real ,imaginary ,root1,root2;
      discriminant  = b*b - (4*a*c);
      if(discriminant < 0){
        real = -b/(2*a);
        imaginary = Math.sqrt((-discriminant ))/(2*a);
        System.out.println("roots are different and  complex/imaginary ");
       System.out.format("root1 = %.2f + %.2f i", real,imaginary);
       System.out.format("\nroot1 = %.2f - %.2f i",real,imaginary);

      }
      else if(discriminant > 0){
        root1 = (-b+Math.sqrt(discriminant ))/(2*a);
        root2 = (-b-Math.sqrt(discriminant ))/(2*a);
        System.out.println("roots are real and different");
        System.out.format("root1 = %.2f \nroot2 = %.2f", root1,root2);
      }
      else if(discriminant == 0){
        root1=root2= -b/(2*a);
        System.out.format("root1 = %.2f \nroot2 = %.2f",root1,root2 );
        System.out.println("\nroots are real and equal");
      }
      else{
        System.out.println("roots are undefiend");
      }
    }

    
}
