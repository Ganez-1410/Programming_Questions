
public class Pattern {
public static void main(String[] args) {
	int n=4;
	String s="",st="";
	for(int i=0;i<n;i++) {
		s+="*";
		if(i==0||i==n-1)
			st+="*";
		else
			st+=" ";
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++)
			System.out.print(" ");
		if(i==1||i==n)
		System.out.println(s);
		else
			System.out.println(st);
	}
}
}
