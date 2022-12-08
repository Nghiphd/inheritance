
/**
 * Write a description of class appealsCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class appealsCourt extends districtCourt
{
     public appealsCourt(int damage, boolean States, boolean fed,
    boolean bank) {
        super(damage,States,fed,bank);
        district();
    }
    
    public void appeals(boolean win) {
        if(win == true) {
            System.out.println("GET PAID, and go home numbnuts");
        } else if (win == false) {
            ystem.out.println("appeal to higher court");
        }
    }

}
