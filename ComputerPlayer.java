import java.util.Scanner;

public class ComputerPlayer
{
    Scanner kb = new Scanner(System.in);

    public int play(int ResultComputer, int guess)
    {
        if (ResultComputer == -1)
        {
            guess++;
        }
        if (ResultComputer == 1)
        {
            guess--;
        }
        return guess;
    }
}
