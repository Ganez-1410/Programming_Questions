import java.util.Scanner;

public class Task8 {
	static int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
	static boolean isLeap(int y) {
		return (y%4==0)&&(y%100!=0||y%400==0);
	}
	static int count(int d1,int m1,int y1,int d2,int m2,int y2) {
		int c=0;
		if(isLeap(y1)) {
			days[1]=29;
			c=days[m1-1]-d1;
			for(int i=m1+1;i<=12;i++)
				c+=days[i-1];
		}
		else {
			c=days[m1-1]-d1;
			for(int i=m1+1;i<=12;i++)
				c+=days[i-1];
		}
		for(int i=y1+1;i<y2;i++) {
			if(isLeap(i))
				c+=366;
			else
				c+=365;
		}
		if(isLeap(y2)) {
			days[1]=29;
			for(int i=0;i<m2-1;i++)
				c+=days[i];
			c+=d2;
		}
		else {
			for(int i=0;i<m2-1;i++)
				c+=days[i];
			c+=d2;
		}
		if(y1==y2 && isLeap(y1))
			return c-366;
		return y1==y2?c-365:c;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String[] s=sc.nextLine().split(",");
	String[] s1=sc.nextLine().split(",");
	System.out.println(count(Integer.valueOf(s[0]),Integer.valueOf(s[1]),Integer.valueOf(s[2]),
			Integer.valueOf(s1[0]),Integer.valueOf(s1[1]),Integer.valueOf(s1[2])));
}
}
