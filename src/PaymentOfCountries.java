import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class PaymentOfCountries {
public static void main(String[] args) {
	double d=12000.50;
	Locale indiaLocale =new Locale("en","IN");
	NumberFormat u= NumberFormat.getCurrencyInstance(Locale.US);
	NumberFormat c= NumberFormat.getCurrencyInstance(Locale.CHINA);
	NumberFormat n= NumberFormat.getCurrencyInstance(Locale.UK);
	NumberFormat i= NumberFormat.getCurrencyInstance(indiaLocale);
	System.out.println(u.format(d));
	System.out.println(c.format(d));
	System.out.println(n.format(d));
	System.out.println(i.format(d));
	Scanner sc=new Scanner(System.in);
	//String n="6";
//	BigInteger m=new BigInteger(String.valueOf(sc.nextBigInteger()));
//	BigInteger n=new BigInteger(String.valueOf(sc.nextBigInteger()));
//	System.out.println(m.add(n));
//	System.out.println(m.multiply(n));
	
	
//	String s="zzoooo";
//	Pattern p=Pattern.compile("(^z+)(o+)");
//	Matcher m=p.matcher(s);
//	if(m.find())
//		System.out.println(m.group(1).length()*2==(m.group(2).length())?"Yes":"No");
//
//	Matcher m1=p1.matcher(s);
//	if(m.find() && m1.find()) {
//		int a=(m.end()-m.start())*2;
//		int b=m1.end()-m1.start();
//		System.out.println(a==b?"Yes":"No");
//		
//	}
//	String s="All-convoYs-9-be:Alert1.";//sc.nextLine();
//    int n=4;
//    for(int i=0;i<s.length();i++){
//        if(Character.isDigit(s.charAt(i)))
//        System.out.print(Integer.valueOf(""+s.charAt(i))+n>10?Integer.valueOf(""+s.charAt(i))+n-10:Integer.valueOf(""+s.charAt(i))+n);
//        else if(Character.isLetter(s.charAt(i))) {
//        	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
//        		System.out.print((char)(s.charAt(i)+n>90?s.charAt(i)+n-26:s.charAt(i)+n));
//        	else
//        		System.out.print((char)(s.charAt(i)+n>122?s.charAt(i)+n-26:s.charAt(i)+n));
//        }
//        else
//        	System.out.print(s.charAt(i));
//	}
	
	
//	BigDecimal b=new BigDecimal("000.002");
//	BigDecimal c=new BigDecimal("0.001");
//	System.out.println(b.compareTo(c));
//	String s="abgfdjs";
//	s=s.replace(s.charAt(3),'z');
//	System.out.println(s);
	
//	StringBuffer sb=new StringBuffer("abghdk");
//	char[] ch= {'a','u','i'};
//	String st=new String(ch);
//	System.out.println(st);
//	String s="baceb";   //count a vowel in all possible substring
//        long count=0;
//for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
//				count+=(long)(s.length()-i)*(i+1);
//}
//System.out.println(count);
	
}
}
