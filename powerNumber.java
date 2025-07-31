import java.util.*;
class Main{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0, mul=1;
        int temp=n;
        while(temp!=0)
        {
           sum+=temp%10;
           mul*=temp%10;
           temp/=10;
        }
        //System.out.println(sum);
        //System.out.println(mul);

       if(sum==mul){
         System.out.println("Power number");
       }
     }
}