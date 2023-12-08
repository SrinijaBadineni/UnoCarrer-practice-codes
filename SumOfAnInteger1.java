package first.program;

public class SumOfAnInteger1 {
   
	public static void main(String[] args) {
		int n=258910;
		int res=findSum(n);
		System.out.println("Total sum="+res);
	}
	static int findSum(int n)
	{
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
}
