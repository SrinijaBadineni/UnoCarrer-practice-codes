package first.program;

public class DigitRoot {
	
	static int sumOfDigit(int num) {
		int sum=0;
		while(num > 0 || sum > 9)
	    {
	        if(num == 0)
	        {
	            num = sum;
	            sum = 0;
	        }
	        sum += num % 10;
	        num /= 10;
	    }
	    return sum;
	}
	public static void main(String[] args) {
		// Sum of an integer 2
		int num=434689;
		System.out.println("Sum of digit is: "+sumOfDigit(num));

	}

}
