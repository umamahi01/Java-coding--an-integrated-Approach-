import java.util.*;
class StudentInfo{
    public static void main(String[]args){
          System.out.print("enter rows and clmns:-");
          Scanner sc = new Scanner(System.in);
          int r,c;
          r=sc.nextInt();
          c =sc.nextInt();
          String array[][] = new String[r][c];
          System.out.print("enter array elements:-");
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextLine();
            }
          }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}