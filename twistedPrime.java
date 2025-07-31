//num = 13 first check this number is prime or not if this number is prime then reverse the number check that reverse number also prime or not if both true print the twisted prime

import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
               c++;
            }
        }
        if(c==2)
        {
           int temp=n, rev=0;
           while(temp!=0){
               rev=rev*10+temp%10;
               temp/=10;
           }
           if(rev!=n)
           {
                int count=0;
                for(int j=1;j<=rev;j++){
                     if(rev%j==0){
                         count++;
                     }
                }
                if(count==2){
                    System.out.println("twisted Prime number" +rev);
                }
           }
           else if(rev==n){
                System.out.println(n + "Twisted prime number"+ rev);
           }
           else{
               System.out.println("not twisted number");
           }
        }
    }
}