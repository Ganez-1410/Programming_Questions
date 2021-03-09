public class India_flag
{
    public static void main(String[] args) {
       for(int i=1;i<=20;i++)
       {
          for(int j=1;j<=25;j++)
          {
          if(i>1&&i<11&&j>1&&j<25){
              if(i==11&&j>1&&j<25||i==4||i==8)
                System.out.print("-");
              else{
                if(i>4&&i<9&&j>8&&j<=17)
                   System.out.print("*");
                else
                    System.out.print(" ");
            }
          }
          else{
              if(i>=12&&i<=20&&j>1&&j<=25)
                 System.out.print(" ");
              else 
                 System.out.print("#");
          }
              
          }
          
          System.out.println();
       }
    }
}