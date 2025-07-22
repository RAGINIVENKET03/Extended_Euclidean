import java.util.*;
class ExtendedEuclidian
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int r1=obj.nextInt();
        System.out.println("Enter the second number: ");
        int r2=obj.nextInt();
        int e=0;
        if(r1>r2)
        {
            e=extendedEuclidian(r1,r2,0,1,1,0);
        }
        else
        {
            e=extendedEuclidian(r2,r1,0,1,1,0);
        }
        System.out.println("The gcd of ("+r1+","+r2+")= "+e);
    }
    public static int extendedEuclidian(int r1,int r2,int t1,int t2,int s1,int s2)
    {
        int q=(int)(Math.floor(r1/r2));
        int r=r1%r2;
        int t=t1-(t2*q);
        int s=s1-(s2*q);
        if(r!=0)
        {
            r1=r2;
            r2=r;
            t1=t2;
            t2=t;
            s1=s2;
            s2=s;
            return extendedEuclidian(r1,r2,t1,t2,s1,s2);
        }
        return r2;
    }
}
