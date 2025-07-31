import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int firstMax=0;
         int secondMax=0;
         int rem=0;
         while(n!=0)//1
         {
            rem=n%10;//5, 6 , 7 , 3
            if(rem>firstMax){//5>0, 6>5, 7>6 , 8>7 , 3>8

                                                                                                                      
                 firstMax=rem;//firstMax=5,6, 7 , 8

            }
            else if(rem>secondMax && rem!=firstMax)// 3>7
            {
                secondMax=rem;
            }
            n/=10;//123876, 12387, 1238 , 123
         }
        //System.out.println(firstMax);

       System.out.println(secondMax);//7
    }
}


//125647