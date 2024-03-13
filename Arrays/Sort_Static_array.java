public class Sort_Static_array {
    public static void main(String[] args){
        int array [] = {45,34,67,12,9,23};
        int temp;
        boolean flag = false;
        
        for(int i =0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                 if(array[j]>array[j+1]){
                    temp  = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag = true;
                 }
             }
             if(flag == false) break;
             else flag = false;

        }
        System.out.print("after sorting:-");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
