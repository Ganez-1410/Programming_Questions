import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHash {
public static void main(String[] args) {
//	String s="happynewyear";
//	List<String> withDupes = Arrays.asList(s);
//	System.out.println("List with duplicates: " + withDupes); 
//	List<String> withoutDupes = withDupes.stream() .distinct() .collect(Collectors.toList()); 
//	System.out.println("List without duplicates: " + withoutDupes);
//	String[] array = {"matt", "jason", "michael"};
//    Arrays.stream(array)
//            .map(name-> name.charAt(0))
//            .distinct()
//            .map(ch -> Arrays.stream(array).filter(name->name.charAt(0) == ch).findAny().get())
//            .forEach(System.out::println);
	String s="happynewyear";
	LinkedHashSet<Character> l=new LinkedHashSet<>();
	for(int i=0;i<s.length();i++)
		l.add(s.charAt(i));
    s="";
    Iterator<Character> i=l.iterator();
    while(i.hasNext())
    	s=s+i.next();
    System.out.println(s);
}
}
