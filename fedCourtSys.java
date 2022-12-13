import java.lang.Math;

public class fedCourtSys
{
    Rand10 num1 = new Rand10();
    Rand10 num2 = new Rand10();
    Rand10 num3 = new Rand10();
    Rand10 num4 = new Rand10();
    Rand10 num5 = new Rand10();
    Rand10 num6 = new Rand10();
    Rand10 num7 = new Rand10();
    Rand10 num8 = new Rand10();
    Rand10 num9 = new Rand10();
    Rand10 num10 = new Rand10();
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
        num6.roll();
        num7.roll();
        num8.roll();
        num9.roll();
        num10.roll();
        this.defendent = defense;
        this.plantiff = plant;
        this.year = year;
        System.out.println(defendent + " VS " + plantiff);
    }

    public boolean accepted(boolean bankruptcy,boolean fedLaw)
    {
        return (bankruptcy || fedLaw);
    }

    public String caseNumber() {
        int[] a = new int[]{num1.value,num2.value,num3.value,num4.value,
            num5.value,num6.value,num7.value,num8.value,num9.value,num10.value};
        return(""+a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]);
    }
}
