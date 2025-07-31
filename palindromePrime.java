//write a java program to print palindromic primes between a specific range
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            int num=i,rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num/=10;
            }
            if(i==rev)
            {
                int temp=i,count=0;
                for(int j=1;j<=temp;j++){
                    if(temp%j==0){
                          count++;
                       }
                }
                if(count==2){
                     System.out.println("Palindromic prime number " + i); 
                }
            }
        }
    }
}