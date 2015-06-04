
/**
 * Write a description of class project1 here.
 * 
 * @tharuni  
 * @v1.0 
 */
public class problem1
{
public static void main(String[] args)
{

        int total=0;
        for( int i=1;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                System.out.println("no: " + i);
                 total=total+i;
            }
            
       }

            System.out.println("total: " + total);
}
}
