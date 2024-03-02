import java.io.*;
public class ValidTrianglewithInputNUm {
    public static void main(String [] args) throws IOException{
        System.out.print("enter SideOne:- ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sideOne =Integer.parseInt(br.readLine());
        System.out.print("enter SideTwo:- ");
        int sideTwo = Integer.parseInt(br.readLine());
        System.out.print("enter SideThree:- ");
        int sideThree = Integer.parseInt(br.readLine());

        
             //sum of any two sides can be greater than other side
        if(sideOne+sideTwo >sideThree || sideOne+sideThree>sideTwo || sideTwo+sideThree>sideOne){
            System.out.print("it can form a triangle");
        }
        else{
            System.out.println("it cannot form a triangle");
        }
    }
    
}
