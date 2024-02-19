import java.io.*;


public class FabinocciSeries {
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //**creating BufferedReader object br to read InputStreamReader  object that takes input from keyboard(field(in) in System class)*/
        System.out.println("enter n times = ");//taking input 
        String str = br.readLine();//BufferedReader object reads input from keyboard with readLine() method remeber to add or handle IOexception at main method signature (throws IOException) basically we add this bcz bufferedReader class throws IOException when read() or readLine() method is used so to handle this runtime error simply throws IOException or handle the IOException with try-catch block
        int n = Integer.parseInt(str); //String input converted into int by using Integer class parseInt() method
        int f1 = 0;
        int f2 = 1;
        int f = f1+f2;
        System.out.print(f1+" "+ f2+" "+f+" ");

    //    **method-1**
        // for(int i=3;i<n;i++){
        //        f1 = f2;
        //        f2 = f;
        //        f = f1+f2;
        //        System.out.print(f+" ");
        // }
        //**mthod 2 */ 
        int count = 3; //varaible starts at 3 bcz we already printed 3 series of numbers 
        while(count < n){ //so condition starts from 3<n until it reaches a point n<n loop will exit
               f1 = f2;
               f2 = f;
               f= f1+f2;
               System.out.print(f+" "); 
               count++;  //the count variable should be increment bcz to exit the loop to reach condition n<n if the count variable not incremented this will go infinite loop
        }

    }
}
