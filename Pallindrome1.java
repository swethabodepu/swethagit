class Palindrome
 {
    public static void main(String a[]) 
         {

             int n=585,s=0, r, temp;
             temp = n;
             while( n>0)
               {
                  r= n % 10;
                  s = s*10+r;
                  n=n/10;
               }

             if (temp==s)
                 System.out.println(" 585 is palindrome");
             else
                 System.out.println(" 585 is not a palindrome");
    }
}
