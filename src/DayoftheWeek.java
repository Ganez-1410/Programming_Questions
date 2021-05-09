import java.text.*;
import java.util.Date;

public class DayoftheWeek {
public static void main(String[] args) throws ParseException {
	 String input_date="27-04-2021";
	  SimpleDateFormat format1=new SimpleDateFormat("dd-MM-yyyy");
	  Date dt1=format1.parse(input_date);
	  DateFormat format2=new SimpleDateFormat("EEEE"); 
	  String finalDay=format2.format(dt1);
	  System.out.println(finalDay);
}
}
