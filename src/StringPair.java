 import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern; 
public class  StringPair
{ 
static String convert(char[] num) 
{ 
    int len = num.length;  
    String s="";
    String[] single_digits = { "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
    String[] two_digits ={"", "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
    String[] tens_multiple ={"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"}; 
    if (len == 1)  
    { 
        return s+single_digits[num[0] - '0']; 
    } 
   else if(len==3){ 
        return "hundred"; 
   }
    int x = 0; 
    while (x < num.length)  
    { 
        	if (num[x] - '0' == 1)  
            { 
                int sum = num[x] - '0' +  
                    num[x] - '0';  
                return s+two_digits[sum]; 
            } 
            else if (num[x] - '0' == 2 &&  
                    num[x + 1] - '0' == 0) 
            {  
                return "twenty"; 
            } 
            else
            { 
                int i = (num[x] - '0'); 
                if(i > 0) 
                    s+=tens_multiple[i]+" "; 
                else
                	s+="";
                ++x; 
                if (num[x] - '0' != 0) 
                    s+=single_digits[num[x] - '0'];
            } 
        ++x; 
    } 
    return s;
} 
public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] a=new String[n];
	for(int i=0;i<n;i++)
		a[i]=sc.next();
	int count=0;
	for(int i=0;i<n;i++) {
		String s=convert(a[i].toCharArray());
		Pattern vowelPattern = Pattern.compile("[aeiou]");
		Matcher vowelMatcher = vowelPattern.matcher(s);
		 while (vowelMatcher.find())
			 count++;
	}
	int c=0;
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if((Integer.valueOf(a[i])+Integer.valueOf(a[j]))==count)
			  c++;	
		}
	}
	switch(c) {
	case 1:System.out.println("one");
	       break;
	case 2:System.out.println("two");
    break;
	case 3:System.out.println("three");
    break;
	case 4:System.out.println("four");
    break;
	case 5:System.out.println("five");
    break;
	case 6:System.out.println("six");
    break;
	case 7:System.out.println("seven");
    break;
	case 8:System.out.println("eight");
    break;
	case 9:System.out.println("nine");
    break;
	case 0:System.out.println("zero");
    break;
    
	}
	//System.out.println(convert(String.valueOf(c).toCharArray()));
} 
}