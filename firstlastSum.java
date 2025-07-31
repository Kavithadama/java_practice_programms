import java.util.*;
class Main {
      public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int count=0;
           int temp=n;
           while(temp!=0){
               count++;
               temp/=10;
           }
           int rev=0, copy=n;
           while(copy!=0)
           {
               rev=rev*10+copy%10;
               copy/=10;
           }
           for(int i=1;i<=count/2;i++){
               int firstdigit=n%10;
                 n/=10;

               int lastdigit = rev%10;
                 rev/=10;
               System.out.println(firstdigit+lastdigit);
            
           }
           if(count%2!=0){
               System.out.println(rev%10);
           }
                

      }
}

