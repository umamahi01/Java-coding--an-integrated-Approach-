import java.io.*;

public class CountCurrencyNotesForGivenAmount {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter amount:- ");
        int Amount = Integer.parseInt(br.readLine());
        if(Amount< 0){
            System.out.println("enter proper amount greater than 0.");
        }
        if(Amount>2000){
            System.out.println("2000 notes= "+ Amount/2000);
            Amount %= 2000;
        }
        if(Amount>500){
            System.out.println("500 notes = "+Amount/500);
            Amount %= 500;

        }
        if(Amount>200){
            System.out.println("200 notes = "+Amount/200);
            Amount %= 200;
        }
        if(Amount>100){
            System.out.println("100 notes= "+Amount/100);
            Amount %= 100;
        }
        if(Amount>50){
            System.out.println("50 notes= "+Amount/50);
            Amount %= 50;

        }
        if(Amount>20){
            System.out.println("20 notes= "+Amount/20);
             Amount %= 20;
        }
        if(Amount>10){
            System.out.println("10 notes = "+Amount/10);
            Amount %= 10;
        } 
        if(Amount>5){
            System.out.println("5 rupee = "+Amount/5);
            Amount %= 5;
        }
        if(Amount>2){
            System.out.println("2 rupee="+Amount/2);
            Amount %= 2;   //3%2 = 1 
        }
        if(Amount>=1){
            System.out.println("1 ruppe ="+Amount);
            Amount = 0;
        }
       
   
    }

    } 

