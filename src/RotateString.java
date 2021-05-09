import java.util.*;

/*
 * ip:forcodecrazy
	  codecrazyfor
 op:YES
 */
public class RotateString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length())
            System.out.println("NO");
        else{
            int i;
            for(i=0;i<a.length();i++){
                char ch=a.charAt(0);
         a=(new StringBuilder(a).deleteCharAt(0).insert(a.length()-1,ch).toString());
                if(a.equals(b)){
                    System.out.println("YES");
                    break;
                }
            }
            if(i==a.length())
              System.out.println("NO");
        }
    }
}
