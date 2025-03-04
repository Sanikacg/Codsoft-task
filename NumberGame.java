
import java.util.Scanner;
public class NumberGame{
public static void main( String []args){
    Scanner sc=new Scanner(System.in);
    int Chances=7 ;
    int finals=0;
    boolean playAgain=true;
    System.out.println("Welcome Friend ! Let's Start the Game..");
    System.out.println("You have about "+Chances+ " Chances to win the game");
    while(playAgain){
        int rand=getrandN(1,100);
        boolean guess=false;
        for(int i=0;i<Chances;i++){
            System.out.println("Chance"+(i+1)+"Guess the number:");
            int user=sc.nextInt();
            if(user==rand){
                guess=true;
                finals+=1;
                System.out.println("Let's Do Party.You won it.");
                break;
            }
            else if(user>rand){
                System.out.println("Too high");
            }
             else {
                System.out.println("Too Low");
             }

        }
    if (guess==false){
        System.out.println("Game Over");
    }
    System.out.println("Do you want to play Again(y/n)");
    String pA=sc.next();
    playAgain=pA.equalsIgnoreCase("y");
    }
    System.out.println("That's it buddy ,Hope you enjoyed it");
    System.out.println("Your Score"+finals);
}
    public static int getrandN(int min,int max){
        return(int)(Math.random()*(max-min+1)+min);
    }

}

