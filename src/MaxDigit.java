import java.math.BigInteger;
import java.util.*;
public class MaxDigit{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
       String s1="1";
       String s2="9";
       for(int i=1;i<n;i++){
         s1+="0";
         s2+="9";
       }
       BigInteger b=new BigInteger(s1);
       BigInteger c=new BigInteger(s2);
       System.out.println(b+" "+c);
       BigInteger d=new BigInteger("3");
       BigInteger e=new BigInteger("7");
       for (BigInteger bi = b;bi.compareTo(c) ==-1||bi.compareTo(c) ==0;bi = bi.add(BigInteger.ONE)) {
    	   if(bi.mod(d).equals(BigInteger.ZERO)&&bi.mod(e).equals(BigInteger.ZERO)) {
    		   System.out.println(bi);
    		  break;
    	   }
       }
   }
}