
public class Rough4 {
public static void main(String[] args) {
	System.out.println(delDel("yakpak","aak"));
}
static String delDel(String str,String word) {
	//return (str.substring(1, 4).equals("del"))?new StringBuffer(str).delete(1, 4).toString():str;
//	String s1=String.valueOf(a);
//	String s2=String.valueOf(b);
//	return (s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1));
  //return (str.length()<=3)?str.toUpperCase():str.subSequence(0, str.length()-3)+str.substring(str.length()-3, str.length()).toUpperCase();
  //return str.substring(0,3).equals("not")?str:"not "+str;
	//return new StringBuffer(str).deleteCharAt(n).toString();
//    char[] c=str.toCharArray();
//	char temp=c[0];
//	c[0]=c[c.length-1];
//	c[c.length-1]=temp;
//	return new String(c);
	//return (str.length()>3)?str.substring(0, 3)+str.substring(0, 3)+str.substring(0, 3):str;
//	System.out.println(str.codePointAt(2));
	//StringBuffer sb=new StringBuffer(str);
	//return str.substring(str.length()-2, str.length());
//	String s="";
//	for(int i=0;i<str.length();i++) {
//		if(str.charAt(i)!='x'&&i!=0)
//	          s+=str.charAt(i);
//	}
//     return s;
//	}
//	System.out.println(str.contains("yak"));
//	return str;
//	String s="";
//	return front?s+str.charAt(0):s+str.charAt(str.length()-1);
	if(str.length()==1&&word.length()==1)
		  return str;
		  return str.length()<=1?"":str.startsWith(word)?word:str.substring(1,word.length()).equals(word.substring(1))?str.substring(0,word.length()):"";
}
}
