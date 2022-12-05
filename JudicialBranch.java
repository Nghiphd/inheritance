
/**
 * Write a description of class USGovernment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JudicialBranch
{
    public class legislativeBranch extends uSGovernment {
        private String Congress;
        private int houseOfRepresentatives;
        private int senate;

    }
    public class executiveBranch extends uSGovernment {
        private String president;
        private String vicePresident;
        private String cabinet;

    }
    public class judicialBranch extends uSGovernment {
        private USSupremeCourt;
        private districtCourts;
        private appealsCourts;
        

    }
}
