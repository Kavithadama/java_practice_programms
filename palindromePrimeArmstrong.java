import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end= sc.nextInt();
        int totalSum=0;
        for(int i=start;i<=end;i++)
        {
             int num=i,rev=0;
             while(num!=0){
                 int rem=num%10;
                 rev=rev*10+rem;
                 num/=10;
             }
           
            if(rev==i){
            int temp=i,c=0;            
            while(temp!=0)
            {
                c++;
                temp/=10;
            }
            //int mod=(int)Math.pow(10,c);
            int num1=i,rem=0,sum=0;
            while(num1!=0)
            {
               rem=num1%10;
               sum+=Math.pow(rem,c);
               num1/=10;
            }
            if(i==sum){
               int count=0;
            for(int j=1;j<=i;j++){
                 if(i%j==0){
                     count++;
                  }
            }
            if(count==2){
               System.out.println("Palindromic armstrong prime number " + i);
               totalSum+=i;
            }


            }           
          }            
        }
         System.out.println(totalSum);
    }
}