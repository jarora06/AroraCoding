import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		System.out.println(isLeapYear(year));

	}
	public static boolean isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)){
           return true;
       } else {
           return false;
       }
   }

}
