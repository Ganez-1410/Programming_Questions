import java.util.Scanner;
public class GarlandWord{
public static void main(String...arg){
  String s=new Scanner(System.in). nextLine().toLowerCase().trim();
   int degree=0;
   for(int i=1;i<s.length();i++) 
       if(s.startsWith(s. substring(i))){ 
           degree=s.length()-i;     
           break;
       }
   if(degree>0)
	   System.out.println("Garland word of degree "+degree);
   else
	   System.out.println(s+" is not a Garland word");  
	
    
}
}