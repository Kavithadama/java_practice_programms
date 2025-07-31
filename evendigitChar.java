import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int c=0;
        while(temp!=0){
            c++;
            temp/=10;
        }
        if(c%2==0){//6574
           while(n!=0){//6574,65!=0
           int mod= (int)Math.pow(10,2);
           
           int rem=n%mod;//74,65
           char ch=(char)rem;
           System.out.println(rem + " " + ch);
           int rev=0;
           while(rem!=0){
              rev=rev*10+rem%10;
              rem=rem/10;
           }
           char ch1=(char)rev;
           System.out.println(rev + " " +ch1);
           n/=mod;//65
           
           }
           
        }
    }
}