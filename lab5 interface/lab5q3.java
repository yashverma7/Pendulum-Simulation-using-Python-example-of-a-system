interface car{
static final float price=7.7f;
float find (float x,float y);
}


class suv implements car{
public float find(float x,float y)
{return (price*x);}}

class sedan implements car{
public float find (float x, float y)
{return (price*y);}}

class test {
public static void main(String args[])
{

sedan nissan= new sedan();
suv duster= new suv();

System.out.println("Price of Sedan(in lakhs)="+nissan.find(1,2));
System.out.println("Price of SUV(in lakhs)="+duster.find(1,2));
}}
