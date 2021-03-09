import java.util.Scanner;
public class SevenSegmentDisplay_HCK{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	sc.nextLine();
	for(int k=0;k<T;k++){
		String s=sc.nextLine();
	int t=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='1')
			t+=2;
		else if(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5')
			t+=5;
		else if(s.charAt(i)=='4')
			t+=4;
		else if(s.charAt(i)=='6'||s.charAt(i)=='9'||s.charAt(i)=='0')
			t+=6;
		else if(s.charAt(i)=='7')
			t+=3;
		else if(s.charAt(i)=='8')
			t+=7;
	}
	if(t%2==0){
	for(int i=0;i<t/2;i++)
	System.out.print("1");
	}
	else{
	System.out.print("7");
	for(int i=0;i<t/2-1;i++)
	System.out.print("1");
	}
	System.out.println();
	}
}
}