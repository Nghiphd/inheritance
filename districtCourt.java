
/**
 * Write a description of class districtCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class districtCourt extends fedCourtSys
{
    private boolean win;
    private boolean appeal;
    public districtCourt(String defense, String plant) {
        super(defense,plant);
        this.win = win;
        this.appeal = appeal;
    }

    public String district(boolean win, boolean error) {
        if(win) {
            return("GET PAID, and go home numbnuts");
        }  else if (error) {
            appeal = true;
        }
        return ("appeal to higher court");
    }
}
