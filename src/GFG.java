import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class GFG
{
static BigInteger factorial(int N)
{
BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
for (int i = 2; i <= N; i++)
f = f.multiply(BigInteger.valueOf(i));
return f;
}
public static void main (String[] args)
{
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
while(t-->0){
int n=scan.nextInt();
BigInteger f= factorial(n);
BigInteger fd;
int length = String.valueOf(f).length();
BigInteger bi1;
bi1 = new BigInteger("10");
int exponent = length-1;
BigInteger d=bi1.pow(exponent);
fd=f.divide(d);
length-=1;
System.out.println(fd+" "+length);
}

}
}