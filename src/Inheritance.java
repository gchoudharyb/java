class X
{
    static void staticMethod()
    {
        System.out.println("Class X");
    }
}
 
class Y extends X
{
    static void staticMethod()
    {
        System.out.println("Class Y");
    }
}
 
public class Inheritance
{
    public static void main(String[] args)
    {
    	X y=new X();
        y.staticMethod();
    }
}