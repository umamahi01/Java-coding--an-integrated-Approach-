
 import java.io.*;




public class SimpleArrayInput{
         
    

    public static void main(String [] args) throws IOException{
    System.out.print("enter M(array size):- ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int M = Integer.parseInt(br.readLine());
    int array[] = new int[M];
    System.out.print("enter N(elements in array):-");
    for(int i=0; i<M;i++){
       
        array[i] = Integer.parseInt(br.readLine());
    }


    for(int j=0 ;j<array.length;j++){
        System.out.println(array[j]);

    }
    
    
    
    }

}