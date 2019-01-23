
/**
 * Simulates a die
 *
 * @author Jack Deschenes
 * @version 2019-01-18
 */
public class Die
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variable
    }

    /**
     * Simulates the rolling of a die
     *
     * @return    the roll
     */
    public int roll()
    {
        // put your code here
        return (int) (Math.random()*6)+1;
    }
}
