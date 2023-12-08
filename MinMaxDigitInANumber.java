package first.program;

public class MinMaxDigitInANumber {
	static void findMinMax(int n)
	{
		int max=0,min=9,r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			if(r>max) max=r;
			if(r<min) min=r;
		}
		System.out.println("Max Digit="+ max + " Min Digit="+min);
	}

	public static void main(String[] args) {
		int n=105;
		findMinMax(n);
	}

}
