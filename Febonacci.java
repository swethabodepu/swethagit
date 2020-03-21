import java.util.Scanner;
class Febonacci
{
    public static void main(String a[])
    {
       int d,b=1,c=1;
       Scanner sc=new Scanner(System.in);
       d=0;
       System.out.println("Enter any number");
       int n=sc.nextInt();
       System.out.println("1 1 ");
       while(d<=n)
       {
          d=b+c;
          if(d>=n)
            break;
          System.out.println(d + " ");
          b=c;
          c=d;
       }
     }
}  


