import java.util.Arrays;
import java.util.Scanner;
public class Rough6{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++) {
    	int n=sc.nextInt();
    	String[] s=new String[n];
    	for(int j=0;j<n;j++)
    	   s[j]=sc.next();
    	int m=sc.nextInt();
    	s=Arrays.copyOf(s,n+m);
    	System.out.println(s.length);
    	for(int j=m;j<s.length;j++)
    	   s[j]=sc.next();
    	for(int j=m;j<s.length;j++) {
    		int c=0;
    		for(int k=0;k<m;k++) {
    			if(s[k].length()>=s[j].length()&&s[k].substring(0,s[j].length()).equals(s[j]))
    				c++;
    		}
    		System.out.println(c);
    	}
    }
}
}
