import java.util.*;

import java.lang.*;
public class Balance_openClose
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
sc.nextLine();
while(t-- > 0)
{
   String s = sc.nextLine();
   int n = s.length();
   if(n%2 == 1)
       System.out.println(-1);
   else{
       Stack<Character> st = new Stack();
       char par[] = s.toCharArray();
       for(int i=0;i<n;i++)
       {
           if(par[i] == '}' && st.empty())
           {
               st.push(par[i]);
           }
           else if(par[i] == '}' && !st.empty())
           {
               if(st.peek() == '{')
                   st.pop();
               else
                   st.push(par[i]);
           }
           else
               st.push(par[i]);
       }
       System.out.println(st);
     int l = st.size();
     n = 0;
     while(!st.empty() && st.peek() == '{')
     {
         n++;
         st.pop();
     }
     int cl=l-n;
     System.out.println((int)(Math.ceil((float)cl/2)+Math.ceil((float)n/2)));
   }
}

}
}

