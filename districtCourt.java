
/**
 * Write a description of class districtCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class districtCourt extends fedCourtSys
{
    private boolean win;
    public districtCourt(String defense, String plant) {
        super(defense,plant);
        this.win = win;
    }

    public void district(boolean win) {
        if((accepted(true,false) || accepted(false,true)) && win == true){
            System.out.println("GET PAID, and go home numbnuts");
        } else if (accepted(false,false) && win == false) {
            System.out.println("appeal to higher court");
        }
        else {
            System.out.println("invalid");
        }
    }
}
