
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
    public fedCourtSys(int damage, boolean States, boolean fed,
    boolean bank)
    {
        this.damages = damage;
        this.diffStates = States;
        this.fedLaw = fed;
        this.bankruptcy = bank;
    }

    public boolean accepted()
    {
        return (damages > 75000 && diffStates || bankruptcy || fedLaw);
    }

}
