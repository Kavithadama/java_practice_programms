//count the number of palindrome
import java.util.*;
class Main{
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0, count=0;
        for(int i=start;i<=end;i++){
             int num=i,rev=0;
             while(num!=0){
                 rev=rev*10+num%10;
                 num/=10;
             }
             if(i==rev){
                 count++;
                 sum+=i;
                System.out.println("palindrome number " + i);
             }
             
        }
        System.out.println("sum of palindrome numbers "+ sum);
        System.out.println("count of palindrome numbers " + count); 
   }
} 