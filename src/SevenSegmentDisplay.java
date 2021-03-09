import java.lang.*;
import java.util.Scanner;
import java.io.*;
class SevenSegmentDisplay
{
 void LED1(char c)
 {
  if(c=='2'||c=='3'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
   System.out.print(" _");
  else
   System.out.print("  ");
 }
 
 void LED2(char c)
 {
  if(c=='4'||c=='5'||c=='6'||c=='8'||c=='9'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
 }
 
 void LED3(char c)
 {
  if(c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='8'||c=='9')
   System.out.print("_");
  else
   System.out.print(" ");
 }
 
 void LED4(char c)
 {
  if(c=='1'||c=='2'||c=='3'||c=='4'||c=='7'||c=='8'||c=='9'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
 }
 
 void LED5(char c)
 {
  if(c=='2'||c=='6'||c=='8'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
 }
 
 void LED6(char c)
 {
  if(c=='2'||c=='3'||c=='5'||c=='6'||c=='8'||c=='9'||c=='0')
   System.out.print("_");
  else
   System.out.print(" ");
 }
 
 void LED7(char c)
 {
  if(c=='1'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
   System.out.print("|");
  else
   System.out.print(" ");
 }    
 public static void main(String[] args)
 {
 
  SevenSegmentDisplay obj=new SevenSegmentDisplay();
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String number=String.valueOf(n);
  for(int i=0; i<number.length();i++)
  {
   obj.LED1(number.charAt(i));
   if (i!=number.length()-1)
   {
    System.out.print(" ");
   }
  }
  System.out.println();
  for(int i=0; i<number.length();i++)
  {
   obj.LED2(number.charAt(i));
   obj.LED3(number.charAt(i));
   obj.LED4(number.charAt(i));
  }
  System.out.println();
 
  for(int i=0; i<number.length();i++)
  {
 
   obj.LED5(number.charAt(i));
   obj.LED6(number.charAt(i));
   obj.LED7(number.charAt(i));
  }
 
 }
 
}