import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int max=0;
         int rem=0;
         while(n!=0)
         {
            rem=n%10;
            if(rem>max){

               max=rem;

            }
            n/=10;
         }
       System.out.println(max);
    }
}