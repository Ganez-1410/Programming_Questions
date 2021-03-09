import java.util.Scanner;

public class StrongWeek {
	public static void main(String args[] ) throws Exception {
        String s = new Scanner(System.in).nextLine();
        String[] st=s.split(" ");
        int vow=0,cons=0,flag=0,diff=0,easy=0;
        String con="bcdfghjklmnpqrstvwxyz";
        for(int i=0;i<st.length;i++){
        	vow=0;cons=0;flag=0;
            for(int j=0;j<st[i].length();j++){
                st[i].toLowerCase();
                if(st[i].charAt(j)=='a'||st[i].charAt(j)=='e'||st[i].charAt(j)=='i'||st[i].charAt(j)=='o'||st[i].charAt(j)=='u') 
                	vow++;
                else {
                	cons++;
                	for(int k=0;k<con.length()-4&&i>=st[i].length()-4;k++) {
                		if((st[i].charAt(j)==con.charAt(k))&&(st[i].charAt(j)==con.charAt(k+1))&&(st[i].charAt(j)==con.charAt(k+2))&&(st[i].charAt(j)==con.charAt(k+3))) {
                			flag=1;
                			break;
                		}
                	}
                }
                if(flag==1)
                	diff++;
            }
            if(flag==0&&cons>vow)
            	diff++;
            else
            	easy++;
        }
        System.out.println(5*diff+3*easy);
    }
}
