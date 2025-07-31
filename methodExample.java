class Main{
    public static void main(String args[]){
          Example e=new Example();
          e.add();
          e.sub();
          e.mul();
    }
}
class Example{
       void add(){
          System.out.println(10+20);
       }
       void sub(){
           System.out.println(20-10);
       }
       void mul(){
           System.out.println(10*20);
       }
}