import java.util.*;

public class LongestPalindromicSubsequence {
public static void main(String args[]){
	String s="AABCDEBAZ";
	int length=s.length();
	System.out.println("str len:"+length+" "+s+"\n");
	longestPalindromicSubsquence(s, length);
}

static void longestPalindromicSubsquence(String s,int length){
	char[] chars=s.toCharArray();
	int [][] arr=new int[chars.length][chars.length];
	for(int i=0;i<chars.length;i++)
	  arr[i][i]=1;
	for(int sublen=2;sublen<=chars.length;sublen++){
	  for(int i=0;i<=arr.length-sublen;i++){
		  int j=i+sublen-1;
		  if(chars[i]==chars[j]&&sublen==2)
			  arr[i][j]=2;
		  else if(chars[i]==chars[j])
			  arr[i][j]=arr[i+1][j-1]+2;
		  else
			  arr[i][j]=Math.max(arr[i+1][j], arr[i][j-1]);
		  }
	}
	   printMatrix(arr,chars);
	   System.out.println("length="+arr[0][arr.length-1]);
}
static void printMatrix(int [][] arr,char[] chars){
	System.out.println("       A  A  B  C  D  E  B  A  Z");
	System.out.println("[i/j]  0  1  2  3  4  5  6  7  8\n");
	for(int i=0;i<arr.length;i++){
		System.out.print(chars[i]+" "+i+"  ");
		for(int j=0;j<arr.length;j++) {
			System.out.print("  " + arr[i][j]);
		}
	System.out.println();
	}
}
}