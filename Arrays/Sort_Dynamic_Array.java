import java.io.*;
class Sort_Dynamic_Array{
    public static void main(String[] args) throws IOException{
        System.out.println("enter size of array:-");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        System.out.println("enter array value:-");

        for(int i=0;i<array.length;i++){
            array[i]  = Integer.parseInt(br.readLine());
        }
        int temp=0;
        boolean flag = false;
        for(int i =0;i<array.length;i++){
            for(int j =0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                    flag = true;
                }
            }
            if(flag == false)break;
            else flag = false;
        }

        System.out.print("after sorting:- ");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}