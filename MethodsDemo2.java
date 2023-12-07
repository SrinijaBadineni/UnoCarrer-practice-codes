package first.program;

public class MethodsDemo2 {
	// Method type 2
			//args...no return
	static void design(char c1,char c2)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(c1);
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.print(c2);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		design('.','!');
		System.out.println("Hello");
		design(',','$');
		System.out.println("Welcome");
		design('@','%');
	}
}
