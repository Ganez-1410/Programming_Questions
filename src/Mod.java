import java.io.*;
import java.util.*;

public class Mod{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
char[] ch=s1.toCharArray();
for(int i=0;i<ch.length;i++)
{
  switch(ch[i])
  {
    case 'a':{
    c++;
      break;}
    case 'e':{
    c++;
      break;}
    case 'i':{
    c++;
      break;}
    case 'o':{
    c++;
      break;}
    case 'u':{
    c++;
      break;}
    case 'A':{
    c++;
      break;}
    case 'E':{
    c++;
      break;}
    case 'I':{
    c++;
      break;}
    case 'O':{
    c++;
      break;}
    case 'U':{
    c++;
      break;}
  }
}
System.out.println(c); 
  	   }
         catch (Exception e){
  		 System.out.println(e);
  	    }	   
      }  
  }  