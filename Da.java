import java.util.Scanner;
public class Da
{
    public static void main(String[] args)
    {
        int n,i;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no of elements in list");
        n=ob.nextInt();
        int list[]=new int[n];

        System.out.println("enter elements");
        for(i=0;i<n;i++)
        {
            list[i]=ob.nextInt();
        }
        System.out.println("the elements in the list are:");
        for(i=0;i<n;i++)
        {
            System.out.println(list[i]);
        }
    }
}