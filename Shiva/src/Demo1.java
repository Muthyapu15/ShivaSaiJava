
class Demo1
{
	int a=23;
	public void disp()
	{
		System.out.println("reintilization started");
	}
}
class Mainclass1
{
public static void main(String[] args) 
{
System.out.println("main method started");
System.out.println("a="+new Demo1().a);
new Demo1().disp();
System.out.println("a="+new Demo1().a);
new Demo1().disp();




}
}