package DateMethods.com;

public class DateMethods 
{
	public static int Jan=31;
	public static int Feb=28;
	public static int Mar=31;
	public static int Apr=30;
	public static int May=31;
	public static int Jun=30;
	public static int Jul=31;
	public static int Aug=31;
	public static int Sep=30;
	public static int Oct=31;
	public static int Nov=30;
	public static int Dec=31;
	static int d=0;
	private static final int[] DateInMonths = {Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec};
	public void DifferenceOfDates(int SD, int SM, int SY, int ED, int EM, int EY) 
	{
		
		if(SD==ED && SM==EM && SY==EY)
			System.out.println("0");
		else if(SD==ED && SM==EM)
			System.out.println(DaysAndMonth(SY,EY));
		else if(SM==EM && SY==EY)
			System.out.println(MonthAndYear(SD,ED));
		else
			DateDifference(SD,SM,SY,ED,EM,EY);
	}
	private static void DateDifference(int sD, int sM, int sY, int eD, int eM, int eY) 
	{
				 //System.out.println(d);
		for(int i=sY+1;i<=eY-1;i++)
		{
			d=d+SearchYear(i);
		}
				 
		//System.out.println(d);
		if(leapyear(sY)==true&&sM==2)
			d=d+(DateInMonths[sM-1]-sD)+1;
		else
			d=d+(DateInMonths[sM-1]-sD);
		//System.out.println(d);
		for(int i=sM;i<12;i++)
		{
			if(leapyear(sY)==true&&i==1)
				d=d+1;
			d=d+DateInMonths[i];
		}
		//System.out.println(d);
		d=d+eD;
		//System.out.println(d);
		for(int i=eM-2;i>=0;i--)
		{
			if(leapyear(eY)==true&&i==1)
				d=d+1;
			d=d+DateInMonths[i];
		}
			System.out.println(d);
	}

	private static int MonthAndYear(int sD, int eD) 
	{
		if(sD>eD)
			return sD-eD;
		return eD-sD;
	}

	private static int DaysAndMonth(int sY, int eY) 
	{
		int d=0;
		if(leapyear(sY))
		{
			for(int i=sY;i<=eY-1;i++)
			{
				d=d+SearchYear(i);
			}
				  
		}
		else
		{
			for(int i=sY+1;i<=eY;i++)
			{
				d=d+SearchYear(i);
			}
		}
		return d;
	}
	public static int SearchYear(int i)
	{

		if((i%400) ==0 || i%4==0 && i%100!=0)
		{
		    return 366;
		}
		else 
		{   
		    return 365;
		}
	}
	

	private static boolean leapyear(int sY) 
	{
		if((sY%400) ==0 || sY%4==0 && sY%100!=0)
			return true;
		return false;
	}	
}

