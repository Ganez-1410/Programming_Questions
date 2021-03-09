import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
public class MinimumAbsoluteDifferenceInAnArray {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt(),min=Integer.MAX_VALUE,C=-257638183;
//	int[] a=new int[n];
//	for(int i=0;i<n;i++)
//		a[i]=sc.nextInt();
//	for(int i=0;i<a.length-1;i++) {
//		for(int j=i+1;j<a.length;j++) {
//		if(Math.abs(a[i]-a[j])<min)
//			min=Math.abs(a[i]-a[j]);
//		}
//	}
//	System.out.println(min);
//	String s="G a n e s h";
//	StringTokenizer st=new StringTokenizer(s);
//System.out.println(st+"\n"+	st.countTokens()+"\n"+st.nextToken());
//	
//Pattern p=Pattern.compile("[^abc]");
//Matcher m=p.matcher("fast foodfast");
//System.out.println(m.find());
	int n=10;
	System.out.println(IntStream.rangeClosed(1, n-1).filter(i -> n % i == 0).sum());
}
}
