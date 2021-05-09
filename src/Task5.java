import java.util.Scanner;

public class Task5 {
	static void permut(String perm,String in) {
		if(in.length()==0)
			System.out.print(perm+" ");
		else {
			for(int i=0;i<in.length();i++)
				permut(perm+in.charAt(i),in.substring(0,i)+in.substring(i+1));
		}
	}
public static void main(String[] args) {
	String s=new Scanner(System.in).nextLine();
	permut("",s);
}
}
