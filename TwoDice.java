import java.util.Scanner;
import java.util.InputMismatchException;
public class TwoDice
{
    private Diex die1;
    private Diex die2;
    public void roll(){
            die1.roll();
            die2.roll();
    }
   
     public TwoDice(){
         die1 = new Diex(6);
         die2 = new Diex(6);
         this.roll();
    }

    public int getValue(){
        return die1.getValue() + die2.getValue();
    }

}

