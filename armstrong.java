import java.util.*;
class Main{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++)
        {
           int temp=i;
           int c=0;
           while(temp!=0)
           {
               temp/=10;
               c++;
           }
           temp=i;
           int rem=0,sum=0;
           while(temp!=0)
           {
              rem=temp%10;
              sum+=Math.pow(rem, c);
              temp/=10; 
           }
           if(sum==i){
             System.out.println("Armstrong number " + i);

           }
        }
     }
}
