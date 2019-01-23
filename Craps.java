
/**
 * Plays Craps
 *
 * @author Jack Deschenes
 * @version 2019-01-18
 */
public class Craps
{
    // instance variables - replace the example below with your own
    private int point;
    private boolean firstRoll;
    private Dice dice;
    public boolean gameOver;
    public int[] roll;

    /**
     * Constructor for objects of class Craps
     */
    public Craps()
    {
        // initialise instance variables
        firstRoll = true;
        dice = new Dice();
        gameOver = false;
    }

    /**
     * Resets the game
     */
    public void restart()
    {
        firstRoll = true;
        gameOver = false;
    }

    /**
     * Rolls a die in a craps game
     *
     *@return    -1 for lose, 0 for continue, 1 for win
     */
    public int roll()
    {
        // put your code here
        roll = dice.rollTwo();
        int rollSum = roll[0] + roll[1];
        if(firstRoll)
        {
            firstRoll = false;
            if (rollSum == 7 || rollSum == 11)
            {
                gameOver = true;
                return 1;
            }
            else if(rollSum == 2 || rollSum == 3 || rollSum == 12)
            {
                gameOver = true;
                return -1;
            }
            else
            {
                point = rollSum;
                return 0;
            }
        }
        else
        {
            if (rollSum == point)
            {
                gameOver = true;
                return 1;
            }
            else if (rollSum == 7)
            {
                gameOver = true;
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }

    public static void main(String[] args)
    {
        Craps craps = new Craps();
        java.util.Scanner reader = new java.util.Scanner(System.in);
        boolean wantsToPlay = false;
        System.out.println("Do you want to play craps?");
        String result = reader.nextLine();
        if(result.equals("") || result.substring(0,1).equalsIgnoreCase("y"))
        {
            wantsToPlay = true;
            System.out.println("Do you need instructions?");
            if(reader.next().substring(0,1).equalsIgnoreCase("y"))
            {
                System.out.println("On your first toss, you win if you roll a 7 or an 11,\n"
                    + "and you lose if you roll a 2, 3, or 12.\n"
                    + "If you roll something else, that number becomes your \"point,\" and in the subsequent\n"
                    + "rolls, you must roll your point before you roll a 7 to win.\n"
                    + "Otherwise, you lose.");
            }
            System.out.println("Ok, roll your first toss by hitting ENTER!");
            reader.nextLine();
        }
        while (wantsToPlay)
        {
            while(!craps.gameOver)
            {

                result = reader.nextLine();
                if(!result.equals(null))
                {
                    int rollResult = craps.roll();
                    if(rollResult == 1)
                    {
                        System.out.println("You won! You rolled " + craps.roll[0] + " and " + craps.roll[1] + ".");
                    }
                    else if(rollResult == -1)
                    {
                        System.out.println("You lost. You rolled " + craps.roll[0] + " and " + craps.roll[1] + ".");
                    }
                    else
                    {
                        System.out.println("You rolled " + craps.roll[0] + " and " + craps.roll[1] + ".");
                    }
                }
            }
            System.out.println("Would you like to play again?");
            result = reader.nextLine();
            if(!(result.equals("") || result.substring(0,1).equalsIgnoreCase("y")))
            {
                wantsToPlay = false;
            }
            else
            {
                System.out.println("Ok, roll your first toss by hitting ENTER!");
                craps.restart();
            }
        }
    }
}
