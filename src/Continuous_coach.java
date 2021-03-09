import java.util.Arrays;
import java.util.Scanner;

public class Continuous_coach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     int t=sc.nextInt();
	     while(t-->0){
	         String s=sc.next();
	         int count=0;
	         char[] c=s.toCharArray();
	         Arrays.sort(c);
	         for(int i=0;i<c.length-1;i++){
	             if(c[i]+1==c[i+1])
	               count=0;
	            else{
	                count=1;
	                break;
	            }
	         }
	         if(count==0)
	         System.out.println("YES");
	         else
	         System.out.println("NO");
	     }
	}
}
