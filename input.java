import java.util.Scanner;

class Text{
	int myCall(int x, int y)
	{
		int sum = x+y;
		return sum;
	}
}

class Test1
{
	public static void main(String[] x)
	{
		Scanner input = new Scanner(System.in);
		Text obj = new Text();
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		int result = obj.myCall(num1, num2);
		
		System.out.println("The result is :"+result);
		input.close();
		
	}
}