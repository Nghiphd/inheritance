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
    private String defendant;
    private String plaintiff;
    private boolean bankruptcy;
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
        this.bankruptcy = bankruptcy;
        this.defendant = defense;
        this.plaintiff = plant;
    }

    public boolean accepted(boolean fedLaw)
    {
        return (bankruptcy || fedLaw);
    }

    public String NameCase() {
        return(defendant + " VS " + plaintiff);
    }

    public String caseNumber()
    {
        int[] Rand = new int[]{num1.value,num2.value,num3.value,num4.value,
                num5.value,num6.value,num7.value,num8.value,num9.value,
                num10.value};
        return(""+Rand[0]+Rand[1]+Rand[2]+Rand[3]+Rand[4]+
            Rand[5]+Rand[6]+Rand[7]+Rand[8]+Rand[9]);
    }
    
    public String bankruptcy() {
        if(bankruptcy) {
            return("bankruptcy court");
        }
        return("district court");
    }
}
