import java.lang.Math;
/**
 * Write a description of class TechGiant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TechGiant
{
    private String software;
    private String hardware;
    private String cloudComputing;
    public TechGiant() {

    }

    public void moneyMachine() {

    }

    public boolean disregardPrivacy() {
        boolean[] hidden = new boolean[]{true,false};
        boolean options = hidden[Math.round((long) Math.random())];
        if(options){
            System.out.println("SHHHHHHHH");
        } else {
            System.out.println("HIDE IN EXTRA CHUNKY TERMS AND CONDITIONS");
        }
        return options;
    }

    public void stealUserData() {
        boolean illegal = disregardPrivacy();
        boolean legal = disregardPrivacy();
        String[] wordsThatInspire = new String[]{"deceit","connivincd g","low wages","EVIL"}; 
        if(illegal) {
            for(int i = 0; i < wordsThatInspire.length; i++) {
                System.out.println(wordsThatInspire[i]);
            }
        }
    }
}
