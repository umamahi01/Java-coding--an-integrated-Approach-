 import java.util.*;
 class TransposeOfMatrix {
    public static void main(String[] args){
        System.out.print("enter rows and colms:-");
        Scanner sc= new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        int array[][] =new int[r][c];
        System.out.print("enter array elements:-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
       sc.close();
    }
}
