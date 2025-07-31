import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//5
        int mul=n*n;//25
        int rem=0;
        int temp=n;
        int c=0;
        while(temp!=0){
             c++;//2
             temp/=10;
        }
        int mod=(int)Math.pow(10, c);//10^1
        rem=mul%mod;//25%10
        
        if(rem==n){
             System.out.println("automatic number");
        }
        else{
             System.out.println("Not automatic number");
        }
    }
}