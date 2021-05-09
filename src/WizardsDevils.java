
/* ip: 
 * 3 5
W D T W D
D T D W D
D T T W D

	op:
	2
	
	Explanation:wizards kills the adjacent devils and replace his place.
				Ques is how many times it takes to kill all the devils
				1st time:W W T W W
						 W T W W W
						 D T T W W
				2nd time:W W T W W
						 W T W W W
						 W T T W W
		Totally 2 times.				 
*/
import java.util.*;

public class WizardsDevils {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        String[][] str=new String[m][n];
        sc.nextLine();
        int count=0;
        for(int i=0;i<m;i++){
            String[] st=sc.nextLine().split(" ");
            for(int j=0;j<st.length;j++) {
            	if(st[j].equals("D"))
            		count++;
            }	
            str[i]=st;
        }
        int x=0;
       List<List<Integer>> l=new ArrayList<>();
       while(true) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(str[i][j].equals("W")){
                    if(i+1<m && i+1>0 && str[i+1][j].equals("D"))
                          l.add(Arrays.asList(i+1,j));
                    if(j+1<n && j+1>0 && str[i][j+1].equals("D"))
                             l.add(Arrays.asList(i,j+1));                                                                     
                    if(i-1<m && i-1>0 && str[i-1][j].equals("D"))
                             l.add(Arrays.asList(i-1,j));                                                                           
                    if(j-1<m && j-1>0 && str[i][j-1].equals("D"))
                           l.add(Arrays.asList(i,j-1));                                                                           
               	}
         	}
        }
        if(l.size()!=0) {
        	count-=l.size();
        	x++;
        }
        if(l.size()==0||count==0)
        	break;
        for(int k=0;k<l.size();k++)
        	str[l.get(k).get(0)][l.get(k).get(1)]="W";
        l.clear();
       }
       System.out.println(count==0?x:"-1");
    }
}