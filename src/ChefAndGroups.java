import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChefAndGroups {
//    public static void regex(String regex, String searchedString) {
//        Pattern pattern = Pattern.compile(regex);
//        Matcher regexMatcher = pattern.matcher(searchedString);
//        while (regexMatcher.find()) 
//            if (regexMatcher.group().length() > 0)
//                System.out.println(regexMatcher.group());
//    }
	public static void main(String[] args) {
//	String name ="10000111000011";
//    regex("(1+)" ,name);
		String s="101";
		Pattern p=Pattern.compile("(1+)");
		Matcher m=p.matcher(s);
		int c=0;
		while(m.find())
		c++;
		System.out.println(c);
	}
}
