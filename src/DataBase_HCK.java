import java.util.*;
import java.lang.Math;

/*
 INPUT:
 1
 5 2
 name dob f_name date amount 
 AnshulKumar 07/07/1995 Tamal 30/02/2019 20000 
 RahulKumar 07/02/1995 Manish 31/03/2019 16000 

 OUTPUT:
 +-------------+------------+--------+------------+--------+
| name        | dob        | f_name | date       | amount |
+-------------+------------+--------+------------+--------+
| AnshulKumar | 07/07/1995 | Tamal  | 30/02/2019 |  20000 |
| RahulKumar  | 07/02/1995 | Manish | 31/03/2019 |  16000 |
+-------------+------------+--------+------------+--------+
*/
public class DataBase_HCK {
public static void main(String args[] ) throws Exception {
   Scanner sc = new Scanner(System.in);
   int t , m , n ;
   LinkedList<String> attributes = new LinkedList<String>();
   LinkedList<String> touples = new LinkedList<String>();
   LinkedList<Integer> width = new LinkedList<Integer>();
   t = sc.nextInt();
   for(int i=0;i<t;i++){
      m = sc.nextInt();
      n = sc.nextInt();
      for(int j=0;j<m;j++)
         attributes.add(sc.next());
      for(int j=0;j<m*n;j++)
         touples.add(sc.next());
      for(int j=0;j<m;j++){
         int l1 = attributes.get(j).length();
         int l2 = 1 ;
         for(int k=j;k<m*n;k=k+m){
            if(l2 < touples.get(k).length())
               l2 = touples.get(k).length();
         }
         int maxi = Math.max(l1,l2);
         width.add(maxi + 2);
      }
      int q = 0;
      for(int j=0;j<=n+3;j++) {  
         if(j==0 || j==2 || j==n+3) {
            System.out.print("+");      
            for(int k:width) {
               for(int p=0;p<k;p++)
                  System.out.print("-");
               System.out.print("+");
            }
            System.out.print("\n");
         }
         else {
            System.out.print("| ");
            if(j==1) {
               int k=0;
               for(int p:width) {      
                  System.out.print(attributes.get(k));      
                  for(int r=0;r<p-attributes.get(k).length()-1;r++)
                     System.out.print(" ");
                  System.out.print("| ");
                  k++;
               }
               System.out.println();
            }
            else {
               for(int p:width) {      
                  System.out.print(touples.get(q));    
                  for(int r=0;r<p-touples.get(q).length()-1;r++)
                     System.out.print(" ");
                  System.out.print("| ");
                  q++;
               }
               System.out.println();
            }
         }
      }
   }
   sc.close();
}
}

