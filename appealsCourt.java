
/**
 * Write a description of class appealsCourt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class appealsCourt extends districtCourt
{
     public appealsCourt(String defense, String plant, boolean bank) {
        super(defense,plant,bank);
    }
    
    public String appeals(boolean appeal) {
        if(appeal) {
            return("GET PAID, and go home numbnuts");
        }
        return("appeal to higher court");
    }

}
