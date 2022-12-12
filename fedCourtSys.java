
/**
 * Write a description of class fedCourtSys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fedCourtSys
{
    private String defendent;
    private String plantiff;
    private int caseNumber;
    int[] array = new int[]{};
    int year;
    public fedCourtSys(String defense, String plant, int year)
    {
        this.defendent = defense;
        this.plantiff = plant;
        this.year = year;
        caseNumber();
    }

    public boolean accepted(boolean bankruptcy,boolean fedLaw,int damages,boolean diffStates)
    {
        return (damages > 75000 && diffStates || bankruptcy || fedLaw);
    }
    public String getDefendent() {
        return defendent;
    }
    public String getPlantiff() {
        return plantiff;
    }
    public void caseType() {
        String[] caseType = new String[]{"Crinimal","Civil","Domestic","Probate", 
        "Paternity","Mental illness", "Juvenile dependency", "Juvenile Offender",
        "Judgement"};
        System.out.print(caseType[2]);
    }
    public String caseNumber(){
        return ;
    }
    public int getyear(){
        return year;
    }
}
