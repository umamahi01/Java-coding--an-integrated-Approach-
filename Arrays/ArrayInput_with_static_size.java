import java.io.*;

public class ArrayInput_with_static_size{
    public static void main(String[] args)throws IOException{
           String  array[] =new String[100];
           System.out.println("enter name,age,year:-");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           for(int i=0;i<3;i++){
            array[i] = br.readLine();
           }
           for(int i=0;i<3;i++){
           System.out.print(array[i]+" ");
           }


    }
}
