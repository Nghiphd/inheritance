public class appealsCourt extends districtCourt
{
    private boolean reverse;

    public appealsCourt(String defense, String plant, boolean reverse) {
        super(defense,plant);
        this.reverse = reverse;
    }

    public String appeals(boolean error) {
        if(error) {
            return("Start the review process");
        }
        return("Go home numbnuts");
    }

    public String affirmOrReverse(boolean affirm) {
        if(affirm && !reverse) {
            return("you had a good run... numbnuts");
        }
        return("Here we go again");
    }

    public String remand() {
        if(reverse) {
            return("a second chance don't waste it");
        }
        return("SOre lOsers will be sOre lOsers");
    }
}
