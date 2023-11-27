import java.util.Scanner;
import java.util.InputMismatchException;
public class Diex
{
     private int value;
   
    public void roll(int max){
        Scanner sideScan = new Scanner(System.in);
        while(true){
            System.out.println("input the number of sides you want");
            try{
                max = sideScan.nextInt();
                value = (int)(Math.random()*max) + 1;
            }catch (InputMismatchException error) {
               System.out.println("please enter an integer");
                sideScan.next();
           }
        }
    }
     public Diex(){
        roll();
    }
    public int getValue(){
        return value;
    }

}

