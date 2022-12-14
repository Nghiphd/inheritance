import java.util.Scanner;
public class fedCourtSys
{
    Rand10 num1 = new Rand10();
    Rand10 num2 = new Rand10();
    Rand10 num3 = new Rand10();
    Rand10 num4 = new Rand10();
    Rand10 num5 = new Rand10();
    private String defendent;
    private String plantiff;
    private int caseNumber;
    int[] array = new int[]{};
    int year;
    public fedCourtSys(String defense, String plant)
    {
        num1.roll();
        num2.roll();
        num3.roll();
        num4.roll();
        num5.roll();
        this.defendent = defense;
        this.plantiff = plant;
        this.year = year;
    }

    public boolean accepted(boolean bankruptcy,boolean fedLaw)
    {
        return (bankruptcy || fedLaw);
    }

    public String NameCase() {
        return(defendent + " VS " + plantiff);
    }

    public String caseNumber(int year, String type)
    {
        int e;
        String[] caseType = new String[]{"Criminal", "Civil", "Bankruptcy"};
        int[] Rand = new int[]{num1.value,num2.value,num3.value,num4.value,
                num5.value};
        for (int i=0;i<caseType.length;i++) {
            if (caseType[i]) {
                
            }
        }

        return(""+Rand[0]+Rand[1]+Rand[2]+Rand[3]+Rand[4]);
    }
}
