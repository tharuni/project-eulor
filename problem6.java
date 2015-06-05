/**
 * @author tharuni
 * @version v1.0
 */

public class problem6
{
    public static void main(String args[])
    {
        int temp=0;
        int sum=0;
        {
            for(int i=0;i<=100;i++)
            {
                System.out.println("Number: "+i);
                int s=i*i;
                System.out.println("Square: " + s);
                temp=temp+s;
                sum=sum+i;
            }
            System.out.println("total sum: " +  temp);
            System.out.println("total sum: " +  sum);
            int sqr = sum*sum;
            System.out.println("square of total: " + sqr);
            int difference = sqr - temp;
            System.out.println("difference between sum of square and square of sum:" + difference);
        }
    }
}
