class PrimeNum 
{
     public static void main(String a[])
       {

           int n = 23;
           boolean Prime= true;
           for(int i = 2; i <= n/2; ++i)
             {   
               if(n % i == 0)
                 {  
                   Prime = false;
                   break;
                 }
             }

           if (Prime)
              System.out.println("23 is a prime number");
           else
              System.out.println( "23  is not a prime number");
        }
}