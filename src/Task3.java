import java.util.*;

public class Task3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	int i,j,k=0;
	boolean flag=true;
	for(i=0;i<a.length();i++) {
		if(a.charAt(i)!=b.charAt(k) || k==b.length()-1) {
			flag=false;
			break;
		}
		for(j=k;j<b.length();j++) {	
			if(a.charAt(i)!=b.charAt(j))
				break;
		}
		k=j;
	}
	System.out.println(flag?"TRUE":"FALSE");
}
}
