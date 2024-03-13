import java.io.*;
public class ArrayInputwithDynamicsizeAndDynamicinputElements {
    public static void main(String[] args)throws IOException{
        System.out.println("enter size of the array(M):- ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size];
        System.out.print("enter array values:-");
        
        for(int i=0;i<size;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        
        for(int i =0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
