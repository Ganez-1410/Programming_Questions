import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PawriMeme_codechef {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0) {
	String s=sc.nextLine();
	Pattern p=Pattern.compile("party");
	Matcher m=p.matcher(s);
	StringBuilder sb=new StringBuilder(s);
	while(m.find())
		sb=sb.replace(m.start(), m.end(),"pawri");
	System.out.println(sb);
	}
	sc.close();
}
}
