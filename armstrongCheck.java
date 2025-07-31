import java.util.*;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int start=sc.nextInt();
       int end=sc.nextInt();
       int totalSum=0,count=0;
       for(int i=start;i<=end;i++){
       int temp=i;
       int c=0,sum=0;
       while(temp!=0){
           c++;
           temp/=10;
       }
       int temp1=i;
       while(temp1!=0)
       {
           int rem=temp1%10;
           sum+=Math.pow(rem,c);
           temp1/=10;
           
       } 
       if(i==sum)
       { 
          count++;
          totalSum+=i;
          System.out.println("Armstrong number" + i);
       }
      }
      System.out.println(totalSum + " " + count);      
    }
}