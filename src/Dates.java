import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Dates {
	public static Integer count;
public static void main(String[] args) {
	Date d=new Date();
	Date d1=new Date(2020,5,2);
	System.out.println(d1.getDate());
	System.out.println(d);
	System.out.println(d.getDate()+" "+d.toString());
	String s="Geeks";
	StringBuffer sb=new StringBuffer(s);
	for(int i=0;i<sb.length();i++) {
		if(i%2!=0)
			sb.deleteCharAt(i);
	}
	System.out.println(sb);
	Integer num1=400;
	Integer num2=num1;
	num1++;
	System.out.println(num1==num2);
//	if(count<=0)
//	System.out.println("Good");
	
}
}
