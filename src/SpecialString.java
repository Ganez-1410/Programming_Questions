import java.util.*;

/*	reverse the string without affecting the special chracaters
 * ip:a,b$c
 * op:c,b$a
 * */
public class SpecialString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine(); 
        String alp="",spl="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
               alp+=ch;
            else
                spl+=ch;
        }
        int k=alp.length()-1,l=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
              System.out.print(alp.charAt(k--));
            else
              System.out.print(spl.charAt(l++));
            }
    }
}
