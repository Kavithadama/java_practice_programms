import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rem=n%10;
        if(rem==7){
           System.out.println("Busy number");
        }
        else if(temp%7==0){
          System.out.println("Busy number");
        }
        else{
          System.out.println("Not a busy number");
        }
    }
}