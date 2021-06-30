class Car{

int qualityCheck()
{return 0;}

}


//now we form child classes of superclass Car

class Maruti extends Car{
int qualityCheck()
{
return 10;}
}



class BMW extends Car{
int qualityCheck()
{
return 50;}
}



class RollsRoyce extends Car{
int qualityCheck()
{
return 100;}
}



class Test{
public static void main(String args[]){
Maruti m=new Maruti();
BMW b=new BMW();
RollsRoyce r=new RollsRoyce();

System.out.println("Maruti's quality:"+m.qualityCheck());
System.out.println("BMW's quality:" +b.qualityCheck());
System.out.println("RollsRoyce's quality:" +r.qualityCheck());
}
}



