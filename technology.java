import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//
        int temp=n;
        int c=0;
        while(temp!=0){ 
            c++;
            temp/=10;
        }
        if(c%2!=0){
           System.out.println("Number mut be even number");
        }
        int half=c/2;
        int mod=(int)Math.pow(10, half);
        int part1 = n/mod;
        int part2 = n%mod;
        int sum=part1+part2;
        int mul = sum*sum;
        if(n==mul){
            System.out.println("Technology number");
        }
        else
        {
            System.out.println("Not a technology number");
        }

    }
}


