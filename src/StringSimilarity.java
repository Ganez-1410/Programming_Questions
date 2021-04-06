import java.util.*;

public class StringSimilarity {
	static int stringSimilarity(String s) {
	       int sum=0;
	        for(int i=0;i<s.length();i++){
	            String st=s.substring(i);
	            int j;
	            for(j=0;j<st.length();j++){
	                if(st.substring(0,j+1).equals(s.substring(0,j+1)))
	                    continue;
	                else
	                    break;
	            }
	            sum+=j;
	        }
	return sum;
	    }
	public static void main(String[] args) {
		System.out.println(stringSimilarity("aa"));
	}
}
