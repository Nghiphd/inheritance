public class districtCourt extends fedCourtSys
{
    private boolean verdict;

    public districtCourt(String defense, String plant) {
        super(defense,plant);
        this.verdict = verdict;
    }

    private String bankruptcy(boolean bankruptcy) {
        if(bankruptcy) {
            return("Go to bankruptcy court");
        }
        return("Suit and find a lawyer cause this show's on the road");
    }

    private String district(boolean verdict) {
        if(verdict) {
            return("GET PAID and go home numbnuts");
        }
        return("Appeal to higher court");
    }
}
