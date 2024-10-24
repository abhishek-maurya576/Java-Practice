class Test
{
	void myPrint()
	{
		System.out.println("Good Morning");
	}
	int myCal(int x, int y)
	{
		int result = x+y;
		return result;
		
	}
}
class MyTest
{
	public static void main(String[] x)
	{
		Test obj = new Test();
		obj.myPrint();
		Test obj1 = new Test();
		int sum = obj1.myCal(4,5);
		System.out.print("The result "+sum);
	}
}