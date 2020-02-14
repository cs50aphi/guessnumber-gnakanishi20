import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        int numguesses = 0;
        int answer = (((int)Math.random() *10) + 1);
        boolean won = false;
        
        while (won == false)
        {
            System.out.println("Enter your guess: ");
            int guess = kb.nextInt();

            if (guess > answer)
            {
                System.out.println("Too high");
                numguesses++;
            }
            else if (guess < answer)
            {
            System.out.println("Too low");
            numguesses++;
            }
            else
            {
            System.out.println("You got it!");
            numguesses++;
            won = true;
            }
        } 
        
        int NumGuessesComputer = 0;
        int ResultComputer = 0;
        ComputerPlayer computer = new ComputerPlayer();
        boolean ComputerWin = false;
        
        System.out.println("Hello, I am thinking of a number between 1 and 10");
        
        int guess = 5;
        
        while(ComputerWin == false)
        {
            System.out.println("What Is your guess: ");
            guess = computer.play(ResultComputer, guess);
            System.out.println(guess);
            if (guess > answer)
            {
                ResultComputer = 1;
                NumGuessesComputer++;
            }
            else if (guess < answer)
            {
                ResultComputer = -1;
                NumGuessesComputer++;
            }
            else
            {
                ComputerWin = true;
                NumGuessesComputer++;
            }
        }
        System.out.println("It took the computer" + NumGuessesComputer + "to guess the number!");
        
        
    }
        
}