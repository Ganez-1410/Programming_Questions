import java.util.Arrays;

public class Large {
public static void main(String[] args) {
//	String s="";
//	int[] a= {9,5,99,3};
//	Arrays.sort(a);
//	for(int i=0;i<a.length;i++)
//		s=s+a[i];
//	System.out.println(new StringBuffer(s).reverse());
	//System.out.println(22+20.604+44);
	int a=0,b=1,count=20,c=0;
	while(count>2) {
		c=a+b;
		a=b;
		b=c;
		count--;
	}
	System.out.println(c);
}
}
