import java.util.*;

public class Stack_Editor {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Stack<String> s=new Stack<String>();
        String st="";
        int len=0;
        while(t-->0){
            switch(sc.nextInt()){
                case 1:st+=sc.next();
                    s.push("1"+st);
                    break;
                case 2:int n=sc.nextInt();
                    s.push("2"+st.substring(st.length()-n));
                st=new StringBuilder(st).delete(st.length()-n,st.length()).toString();                       
                break;
                case 3:int m=sc.nextInt();
                    System.out.println(st.charAt(m-1));
                    break;
                case 4:String str=s.pop();
                    if(str.charAt(0)=='1')
                st=new StringBuilder(st).delete(st.length()-str.length()+1,st.length()).toString();   
                   else
                       st+=str.substring(1);
                    break;
            }
        }
    }
}
