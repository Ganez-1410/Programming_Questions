import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringToken {
public static void main(String[] args) {
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));	
	StringTokenizer st=new StringTokenizer("2 55 7");
	System.out.println(st.nextToken()+" "+st.hasMoreElements()+st.nextToken()+" "+st.hasMoreElements()+st.nextToken()+" "+st.hasMoreElements());
}
}
