
public class ProtectedTest {
	protected int iwer=10;
}
class A1 extends ProtectedTest
{
	
}
class A2 extends A1
{
public static void main(String[] args) {
	A2 a2 = new A2();
	int y = a2.iwer;
}	
}