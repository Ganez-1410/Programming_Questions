import java.util.Scanner;
/*12
3 100 0 2 2 2
4 5 5 3 2 1
9 10 16 3 2 1
4 4 4 1 2 3
3 6 3 2 3 1
4 4 6 5 3 2
2 3 3 1 2 3
5 5 4 3 2 2
2 100 0 3 2 2
2 3 1 10 1 2
10 10 20 1 100 2
850000 9500000 70000 250000 100000 650000
---*/
public class CollegeLife {
	static void sort(int[] prices,String[] dishes) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<3-i-1;j++) {
				if(prices[j]>prices[j+1]) {
					int t=prices[j];
					prices[j]=prices[j+1];
					prices[j+1]=t;
					String s=dishes[j];
					dishes[j]=dishes[j+1];
					dishes[j+1]=s;
				}
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
	int n=sc.nextInt();
	int egg=sc.nextInt();
	int choco_bar=sc.nextInt();
	String dishes[]= {"omelette","choco_milk","choco_cake"};
	int prices[]=new int[3];
	for(int i=0;i<3;i++)
		prices[i]=sc.nextInt();
	sort(prices,dishes);
	int cost=0,items=0;
	for(int i=0;i<3;i++) {
		if(items==n)
			break;
		if(dishes[i].equals("omelette")) {
			while(egg>=2 && items!=n) {
				egg-=2;
				cost+=prices[i];
				items++;
			}
		}
		else if(dishes[i].equals("choco_milk")) {
			while(choco_bar>=3 && items!=n) {
				choco_bar-=3;
				cost+=prices[i];
				items++;
			}
		}
		else {
			while(egg>=1 && choco_bar>=1 && items!=n) {
				egg-=1;
				choco_bar-=1;
				cost+=prices[i];
				items++;
			}
		}
	}
	System.out.println(items<n?"-1":cost);
	}
}
}
