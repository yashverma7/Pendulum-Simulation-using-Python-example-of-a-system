interface test{
int square(int x);
}

class arithmetic implements test{

public int square(int x)
{return (x*x);}
}

class ToTestInt 
{
public static void main(String args[])
{
arithmetic obj= new arithmetic ();
System.out.println("in class ToTestInt using object of arithmetic class:");
System.out.println("Square of no.="+obj.square(6));
}}