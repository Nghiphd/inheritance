
/**
 * Write a description of class districtCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class districtCourt extends fedCourtSys
{
    private boolean win;
    public districtCourt(int damage, boolean States, boolean fed,
    boolean bank, boolean win2) {
        super(damage,States,fed,bank);
        this.win = win2;
    }

    public void district(boolean win) {
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
