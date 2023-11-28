import java.util.Scanner;
import java.util.InputMismatchException;
public class Diex
{
     private int value = 1;    
    public void roll(int max){
        value = (int)(Math.random()*max) + 1;
    }
   
     public Diex(){
        Scanner sideScan = new Scanner(System.in); 
        int max = 0;
        while(true){
            System.out.println("input the number of sides you want");
            try{
                max = sideScan.nextInt();
                value = (int)(Math.random()*max) + 1;
                System.out.println(getValue());
            }catch (InputMismatchException error) {
               System.out.println("please enter an integer");
                sideScan.next();
           }
        }
        
    }

    public int getValue(){
        return value;
    }

}

