class ArmstrongNumber
 {
    public static void main(String[] args)
     {

        int n= 153,r,temp,s=0;
        temp=n;
        while (n>0)
        {
            r=n%10;
            s=s+r*r*r;
            n=n/10;
        }

        if(s==n)
            System.out.println("Armstrong number");
        else
            System.out.println( "Not an Armstrong number");
     }
}