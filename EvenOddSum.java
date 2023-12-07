package first.program;

public class EvenOddSum {

	public static void main(String[] args) {
		int esum=0,osum=0;
		for(int e=0,o=1;e<=10 || o<=10;e=e+2,o=o+2)
		{
			esum=esum+e;
			osum=osum+o;
		}
	System.out.println("Total Even sum="+esum);
	System.out.println("Total Odd sum="+osum);
	}

}
