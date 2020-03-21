class A
{  
     void run()
{
    System.out.println("A is");}  
}  
class B extends A
{  
 void sleep()
{
   System.out.println("big");
}  
}  
class Inheritance1{  
public static void main(String args[])
{  
B d=new B();  
d.run();  
d.sleep();  
}
}  