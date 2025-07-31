import java.util.*;
class Main {
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int start=sc.nextInt();
          int end=sc.nextInt();
          for(int i=start;i<=end;i++)
          {
            if((i%4==0 && i%100!=0) || (i%400==0))
            {
                 System.out.println("Leap year " + i);
            } 
          }
     }
}