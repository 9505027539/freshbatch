package TestMain.com;

import java.util.Scanner;

import DateFormat.com.DateFormat;
import DateMethods.com.DateMethods;
import DateMonthYear.DateMonthYear;
public class TestMain 
{
	 public static void main(String[] args)
	 {
		 DateFormat DF=new DateFormat();
		 DateMonthYear DMY=new DateMonthYear();
		 DateMethods DM=new DateMethods();
		 /*Scanner s=new Scanner(System.in);
		 System.out.println("enter start date:");
		 DF.StartDate=s.nextLine();
		 System.out.println("enter end date:");
		 DF.EndDate=s.nextLine();*/
		 DMY.Difference("06-12-2017","06-12-2017");
		 DM.DifferenceOfDates(DMY.getStartDay(),DMY.getStartMonth(),DMY.getStartYear(),DMY.getEndDay(),DMY.getEndMonth(),DMY.getEndYear());		 
	 }
}

