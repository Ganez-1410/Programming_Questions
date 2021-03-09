
public class Spl_Numbers {
public static void main(String[] args) {
	long n=412023599,m=594594594359454L,k=7,c=0,j;
	for(long i=n;i<=m;i++) {
		String s=String.valueOf(i);
		for(j=0;j<s.length();j++) {
			if(i==0&&(long)s.charAt((int)i)<k)
				break;
			else {
			if((long)s.charAt((int)j)%k!=0) {
				break;
			}
			}
		}
		if(j==s.length())
			c++;
	}
	System.out.println(c);
}
}
