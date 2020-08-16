import java.io.*;
import java.math.*;
import java.util.*;

class Result {
		/*private static String getDayOfWeek(int val){
		String day = " ";
		switch (val){
			case 1:
				day = "sunday";
				break;
			case 2:
				day = "monday";
				break;
			case 3:
				day = "tuesday";
				break;
			case 4:
				day = "wednesday";
				break;
			case 5:
				day = "thrusday";
				break;
			case 6:
				day = "friday";
				break;
			case 7:
				day = "saturday";
				break;
			
		}
		return day;
	}

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return sa STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	String day_date[] = {"sunday","monday","tuesday","wednesday","thrusday","friday","saturday"};
    	Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        String dod = day_date[c.get(Calendar.DAY_OF_WEEK)-1];
        return dod.toUpperCase();

    }

}

public class Find_Day {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        System.out.println(Result.findDay(mon,day,year));

    }
}