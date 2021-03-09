import java.util.*;
public class Cons {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=2;i<n;i++){
		if(isPrime(i,2))
			list.add(i);
	}
	int sum=0,count=0;
	for(int i=0;i<list.size();i++){
		sum=sum+list.get(i);
		if(isPrime(sum,2) && sum>3 && sum<n)
			count++;
	}
System.out.println(count);
}
static boolean isPrime(int y,int i){
  if(i < y)
   {
    if(y % i != 0)
        return(isPrime(y, ++i));
    return false;
   }
  return true;
}
}