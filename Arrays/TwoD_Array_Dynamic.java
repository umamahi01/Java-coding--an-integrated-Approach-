import java.util.Scanner;

class TwoD_Array_Dynamic {
    public static void main(String [] args){
        System.out.print("enter number of row,columns:-");
        Scanner sc = new Scanner(System.in);
        int rows,colms;
        rows = sc.nextInt();
        colms = sc.nextInt();
        int array2d [][] = new int[rows][colms];
        System.out.print("enter values:-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                array2d[i][j] =sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                System.out.print(+array2d[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();//scanner object should be close from resource leakage
    }
}
