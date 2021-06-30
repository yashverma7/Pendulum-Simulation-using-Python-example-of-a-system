interface new{
void division(int a);
void modules(int b);
}




class stu implements new{
String name;
int a,b;
void name (String name);
public void division(int a);
public void modules(int b);



void display();
{
System.out.println("Name :"+name);
System.out.println("Division :"+division);
System.out.println("Modules :"+modules);
}
}



class test{
public static void main(String args[])
{ stu s=new stu();
s.name("Yash");
s.division(5);
s.modules(15);
s.display();
}
}