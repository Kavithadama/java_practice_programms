import java.util.*;
class Main{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       //int rev=0;
       //int temp=n;
       while(true){
          int temp=n;
          int rev=0;
          while(temp!=0)
          {
             rev=rev*10+temp%10;
             temp/=10;
          }
          if(n==rev){
             System.out.println("palindrome number " + n);
             break;
          }
          else
          {
              n=n+rev;    
          }
       }       
   }
}