import java.util.Scanner;

public class Date_Qus {
public static void main(String[] args) {
	int yr=2001;
	String day="Monday";
	int in=new Scanner(System.in).nextInt();
	int count=0;
	if(yr>in) {
		while(yr!=in) {
			if(yr%4==0)
			  count+=2;
			else
			  count++;
			yr--;
		}
		if(count>7) {
			count%=7;
		}
			count=1-count;
			if(count<0)
				count+=7;
	}
	else if(yr<in) {
		while(yr!=in) {
			if(yr%4==0)
			  count+=2;
			else
			  count++;
			yr++;
		}
		count+=1;
		if(count>=7)
			count%=7;
	}
	else {
		System.out.println("Monday");
		System.exit(0);
	}
	System.out.println(count);
	switch(count) {
	  case 0:System.out.println("Sunday");
	  		break;
	  case 1:System.out.println("Monday");
		break;
	  case 2:System.out.println("Tuesday");
		break;
	  case 3:System.out.println("Wednesday");
		break;
	  case 4:System.out.println("Thursday");
		break;
	  case 5:System.out.println("Friday");
		break;
	  case 6:System.out.println("Saturday");
		break;
	}
}
}
