
/**
 * Write a description of class fedCourtSys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fedCourtSys
{
    private boolean bankruptcy;
    private boolean fedLaw;
    private int damages;
    private boolean diffStates;
    public fedCourtSys(int damages, boolean diffStates, boolean fedLaw,
    boolean bankruptcy)
    {
        this.damages = damages;
    }
    public boolean accepted()
    {
        return (damages > 75000 && diffStates || bankruptcy || fedLaw);
    }
    System.out.println(this.damages[] + diffStates + fedLaw);
}
