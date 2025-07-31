import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         //int n=sc.nextInt();
         int start=sc.nextInt();
         int end=sc.nextInt();
         for(int i=start;i<=end;i++)
         {
            for(int j=1;j<=10;j++)
            {
               System.out.println(i + " * " + j + " = " + (i*j));
            }
         }
    }
}