import java.util.Scanner;
class Perfectnum
{
    public static void main(String[] args) 
     {
       int n, sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any integer ");
       n = sc.nextInt();
       for(int i = 1; i < n; i++)
         {
           if(n % i == 0)
             sum=sum+i;
         }
       if(sum==n)
           System.out.println("Perfect");
       else
           System.out.println(" not Perfect");    
     }
}