
/**
 * Write a description of class uSSupremeCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class uSSupremeCourt extends appealsCourt
{
     public uSSupremeCourt(int damage, boolean States, boolean fed,
    boolean bank) {
        super(damage,States,fed,bank);
    }
    public void proceedings(boolean win) {
        if(accepted()==true && win == true) {
            System.out.println("GET PAID, and go home numbnuts");
        } else if (win == false) {
            System.out.println("appeal to higher court");
        }
        else {
            System.out.println("invalid");
        }
    }
}
