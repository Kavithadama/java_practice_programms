//write a java program to print the sum of factorials of all the digits in a given number
import java.util.*;
class Main 
{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int rem=0,sum=0;
       while(n!=0)
       {
          rem=n%10;
          int mul=1;
          for(int i=1;i<=rem;i++){
                
                mul*=i;// 
          }
          sum+=mul;
          n/=10;

       } 
       System.out.println(sum);
   }
}