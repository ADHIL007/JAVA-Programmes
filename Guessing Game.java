import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int  rm ;
        Random number = new Random();
        int x = number.nextInt(10);
   Scanner myobj= new Scanner(System.in);
   int i ;
   System.out.println("ENter a  number in between 1 -10");
   for(i=0 ;i<5;i++)
   {
      int a = myobj.nextInt();
      if(a == x)
      {
          System.out.println("you Win !!!! YOur Guessing is Correct");
         break;

      }
      else{
          rm= 4 - i;
          System.out.println("Your Guessing is Incorrect !! You still have  " + rm + "chances");

          if (rm == 0)
          {
              System.out.println("You LOSE ,You don't have any chance");
             break;
          }

      }
   }

    }
}

