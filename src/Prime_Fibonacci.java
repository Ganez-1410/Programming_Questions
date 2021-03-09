import java.util.*;
import java.util.stream.*;
public class Prime_Fibonacci {
	static boolean check(int n) {
		return n > 1 && IntStream.range(2, n).noneMatch(i -> n%i==0);
	}
	static void fib(long a,long b,long n) {
		long c=0;
		while(n-->2) {
	    c=a+b;
		a=b;
		b=c;
		}
		System.out.println(c);
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	ArrayList<String> arr=new ArrayList<String>();
	for(int n=a;n<=b;n++) {
	if(check(n)) {
		arr.add(String.valueOf(n));
	}
	}
	ArrayList<String> new_arr=new ArrayList<String>();
	for(int i=0;i<arr.size();i++) {
		for(int j=0;j<arr.size();j++) {
			if(i!=j)
				new_arr.add(arr.get(i)+arr.get(j));
		}
	}
	TreeSet<Integer> arr_2=new TreeSet<Integer>();
	for(int i=0;i<new_arr.size();i++) {
		if(check(Integer.valueOf(new_arr.get(i))))
			arr_2.add(Integer.valueOf(new_arr.get(i)));
	}
	fib(arr_2.first(),arr_2.last(),arr_2.size());
}
}
