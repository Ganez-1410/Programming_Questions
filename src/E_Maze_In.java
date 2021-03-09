import java.util.Scanner;

/*Ankit is in maze. The command center sent him a string which decodes to come out from the maze. 
He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down.
In each command he will traverse 1 unit distance in the respective direction.

For example if he is at (2, 0) and the command is L he will go to (1, 0).

ip=LLRDDR
op= 0 -2      */
public class E_Maze_In {
public static void main(String[] args) {
	String s=new Scanner(System.in).nextLine();
	int x=0,y=0;
	for(int i=0;i<s.length();i++) {
		switch(s.charAt(i)) {
		case 'L':x-=1;break;
		case 'R':x+=1;break;
		case 'D':y-=1;break;
		case 'U':y+=1;break;
		}
	}
	System.out.println(x+" "+y);
}
}
