
/**
 * Simulates two dice rolls
 *
 * @author Jack Deschenes
 * @version 2019-01-18
 */
public class Dice
{
    // instance variables - replace the example below with your own
    private Die die;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        die = new Die();
    }

    /**
     * Rolls two dice
     * @return    the an length-2 array of the rolls
     */
    public int[] rollTwo()
    {
        // put your code here
        return new int[] {die.roll(), die.roll()};
    }
}
