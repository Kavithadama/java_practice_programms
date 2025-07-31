import java.util.*;
class Main{
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int mul=n*n;
      //System.out.println(mul);
      //int temp=mul;
      int sum=0;
      while(mul!=0){
          sum+=mul%10;
          mul/=10;
      }
//System.out.println(sum);
     if(sum==n){
          System.out.println("Evil number");
     }
     else{
         System.out.println("Not a evil number");
     }

    }
}