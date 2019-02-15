package DateMonthYear;

public class DateMonthYear 
{
	static int StartDay;
	static int StartMonth;
	static int StartYear;
	static int EndDay;
	static int EndMonth;
	static int EndYear;
	int D,M,Y,D2,M2,Y2;
	public void Difference(String StartDate,String EndDate)
	{
		D=StartDate.indexOf("-");
		M=StartDate.indexOf("-",D+1);
		Y=StartDate.indexOf("-",M+1);
		this.StartDay = Integer.parseInt(StartDate.substring(0,D));
		this.StartMonth = Integer.parseInt(StartDate.substring(D+1,M));
		this.StartYear = Integer.parseInt(StartDate.substring(M+1,M+5));
		D2=EndDate.indexOf("-");
		M2=EndDate.indexOf("-",D2+1);
		Y2=EndDate.indexOf("-",M2+1);
		this.EndDay = Integer.parseInt(EndDate.substring(0,D2));
		this.EndMonth = Integer.parseInt(EndDate.substring(D2+1,M2));
		this.EndYear = Integer.parseInt(EndDate.substring(M2+1,M2+5));
	}
	public static int getStartDay() 
	{
		return StartDay;
	}
	public static int getStartMonth() 
	{
		return StartMonth;
	}
	public static int getStartYear() 
	{
		return StartYear;
	}
	public static int getEndDay() 
	{
		return EndDay;
	}
	public static int getEndMonth() 
	{
		return EndMonth;
	}
	public static int getEndYear() 
	{
		return EndYear;
	}	
}

