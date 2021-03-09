public class StringBuff {
public static void main(String[] args) {
//  String a=new String("abc");
//  String b="abc";
//  String c="abc";
//  String d=new String("abc");
////  System.out.println(a==b);
////System.out.println(b==c);
////System.out.println(b.equals(c));
////  System.out.println(c==d);
//  System.out.println(d==a);
//  System.out.println(d.equals(a));
//  System.out.println(b.equals(a));
//String str="adelbc";
//System.out.println(str.substring(1, 4));
//	String s=new String("Solo");
//	String s1=new String(s);
//	System.out.println(s+" "+s1);
//	String st="vhkuch";
//	String st1="ch";
//	System.out.println(st.lastIndexOf(st1));
//	StringBuffer sb=new StringBuffer(st);
//	sb.insert(1,"GUD");
//	System.out.println(sb+" "+sb.capacity());
//	StringBuffer sb1=new StringBuffer();
//	System.out.println(sb1.capacity()+" "+sb1.length());
	String str1="Hello"+ ", This program is a example of SringBuffer class and it's functions.";
			//Create a object of StringBuffer class
			StringBuffer strbuf1 = new StringBuffer();
			System.out.print(strbuf1.length()+"\n");
			strbuf1.append(str1);
			System.out.println(strbuf1);
			strbuf1.delete(0,str1.length());
			//append()
			strbuf1.append("Hello");
			strbuf1.append("World");
			System.out.println(strbuf1);
			//insert()
			strbuf1.insert(5,"_Java ");
			System.out.println(strbuf1);
			strbuf1.reverse();
			System.out.print("Reversed string : ");
			System.out.println(strbuf1);
			strbuf1.reverse();
			System.out.println(strbuf1);
			//setCharAt()
			strbuf1.setCharAt(5,' ');
			System.out.println(strbuf1);
			//charAt()
			System.out.print("Character at 6th position : ");
			System.out.println(strbuf1.charAt(6));
			//substring()
			System.out.print("Substring from position 3 to 6 : ");
			System.out.println(strbuf1.substring(3,7));
			strbuf1.deleteCharAt(3);
			System.out.println(strbuf1);
			//capacity()
			System.out.print("Capacity of StringBuffer object : ");
			System.out.println(strbuf1.capacity());
			//delete() and length()
			strbuf1.delete(6,strbuf1.length());
			System.out.println(strbuf1);
}
}
