import java.util.Scanner;
import java.util.ArrayList;
public class DynamicArrayTest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Dynamic Array Test\n");   
        DynamicArray da = new DynamicArray();
        char ch;
        do    
        {
            System.out.println("Dynamic Array");
            System.out.println("1.insert");
            System.out.println("2.size");
            System.out.println("3.display");
        
        int c=s.nextInt();
        switch(c)
        {
            case 1 :
            System.out.println("enter value to be inserted");
            da.insert(s.next());
            break;
            case 2 :
            System.out.println("size:"+da.size());
            break;
            case 3 :
            da.display();
            break;
            default :
        System.out.println("wrong entry");
        break;
        }
        System.out.println("do you want to continue y or n");
        ch=s.next().charAt(0);
    }while(ch=='y');
}
}
class DynamicArray
{

    private ArrayList<String> al;
    public DynamicArray()
    {
        al= new ArrayList<String>();
    }
    public int size()
    {
         return al.size();
    }
    public void insert(String e)
    {
        al.add(e);
    }
    public void display()
    {
        System.out.println("the elements in the array are:"+al);
        System.out.println("\n");
    }
}



        