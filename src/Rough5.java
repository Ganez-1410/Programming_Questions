import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.TimeZone;
//class A{
//	int i,j;
//	A(){
//		i=1;
//		j=2;
//	}
//}
//class Ar{
//	int i;
//	public void display() {
//		System.out.println(i);
//	}
//}
//class Br extends Ar{
//	int j;
//	public void display() {
//		System.out.println(j);
//	}
//}
public class Rough5 {
	// int a=6;
public static void main(String[] args) {
//	String str="hiThe hi vjbb";
//	String str1="JBb";
//	int c=0;
//	for(int i=0;i<str.length()-1;i++) {
//		if(str.charAt(i)=='h'&&str.charAt(i+1)=='i')
//			c++;
//	}
//	System.out.println(c);
//	String[] str=new String[3];
//			str[0]="ganesh";
//			str[1]="arun";
//			str[2]="ananth";
//			str=Arrays.copyOf(str,5);
//			str[4]="pull";
//			
//	
//	System.out.println();
//	Calendar x=new GregorianCalendar(1970,0,1);
//	x.setTimeZone(TimeZone.getTimeZone("GMT"));
//	System.out.println(x.getTimeInMillis());
	//System.out.println((double)7/4);
//	int i=1;
//	for(;i<5;i++)
//		i*=i;
//	System.out.println(i);
//  char[] c= {'a','b','c','d','e'};
//  System.out.println((char)(--c[3]-1));
//	for enum=Rough5 s=Rough5.sat;
//	System.out.println(s.values());
//	System.out.println(s);
//	try {
//	double d=33.44/0.0;
//	System.out.println(d);
//	}
//	catch(ArithmeticException a) {
//		System.out.println(a);
//	}
//	System.out.println(Math.rint(9.7));
//	boolean b=new Integer(1)==new Integer(1);
//	System.out.println(b);
//	String s="Welcome";
//	String s1="Welcome";
//	System.out.println("hi"=="hi");
//	Integer i=3;
//	Integer i1=3;
//	System.out.println(i==i1);
//	i=128;
//	i1=128;
//	System.out.println(i==i1);
	//int x=0111;
//	A o=new A();
//	A a=new A();
//	Scanner sc = new Scanner(System.in);
//	String s="";
//	int n=sc.nextInt();
//	while(n-->=0) {
//		s="";
//		s=sc.nextLine();
//		String[] st=s.split(".");
//		for(int i=0;i<st.length;i++)
//		  System.out.println(st[i]);
//	}
	//String[] st=s.split(" ");
	//System.out.println(s);
//	this is a sample piece of text to illustrate this
//	problem. If you are smart you will solve this right.
//	int []x[]= {{1,2},{3,4,5},{6,7,8,9}};
//	int [][]y=x;
//	System.out.println(y[2][1]);
//	Br b=new Br();
//	b.i=1;
//	b.j=2;
//	Ar r;
//	r=b;
//	r.display();
	String a="IKAIPOCHE";
	String b="ISH";
	StringBuffer sb=new StringBuffer(a);
	//StringBuffer sb1=new StringBuffer(b);
    for(int i=0;i<b.length();i++){
        for(int j=0;j<sb.length();j++){
            if(b.charAt(i)==sb.charAt(j)){
                sb=sb.deleteCharAt(j);
            }
        }
    }
    System.out.println(sb);
} 
}
//public static boolean print(String a,String b) {
//	a=a.toLowerCase();
//	b=b.toLowerCase();
//	return a.endsWith(b)||b.endsWith(a);
//}

