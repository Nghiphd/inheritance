public class uSSupremeCourt extends appealsCourt
{
    private boolean constitutional;
    
    public uSSupremeCourt(String defense, String plant, boolean reverse, boolean constitutional) {
        super(defense,plant,reverse);
        this.constitutional = constitutional;
    }

    private String proceedings(boolean win) {
        if(win) {
            return("You've won and changed America for good you absolute GIGACHAD");
        }
        return("Honestly a pretty good run, I'd probably watch it on TV");
    }
    
    public String judicialReview() {
        if(!constitutional) {
            return("you are in a whole heap of trouble you moron");
        }
        return("yay you didn't break the law, easiest thing on the planet");
    }
}
