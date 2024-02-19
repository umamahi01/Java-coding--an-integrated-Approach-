import java.io.*;


public class FabinocciSeries {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter n times = ");
        String str = br.readLine();
        int n = Integer.parseInt(str);
        int f1 = 0;
        int f2 = 1;
        int f = f1+f2;
        System.out.print(f1+" "+ f2+" "+f+" ");

        // for(int i=3;i<n;i++){
        //        f1 = f2;
        //        f2 = f;
        //        f = f1+f2;
        //        System.out.print(f+" ");
        // }
        int count = 3;
        while(count < n){
               f1 = f2;
               f2 = f;
               f= f1+f2;
               System.out.print(f+" ");
               count++;
        }

    }
}
