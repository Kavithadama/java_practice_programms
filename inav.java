import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int rem=0
        while(n>=9)
        {
          int rem=0, sum=0;
          while(n!=0)
          {
            rem=n%10;
            sum+=rem;
            n/=10;
          }
        //System.out.println(sum);
       n=sum;
       //System.out.println(n);
        }
        if(n==1)
        {
           System.out.println("Inav number");
        }
        else{
           System.out.println("Not inan number");
        }
        //System.out.println(n);
     }
}