package first.program;

public class primeNumOrNot {
	
	static boolean findPrimeOrNot(int n)
	{
		int i=2;
		boolean res=true;
		for(;(i<n/2)&&(n%i !=0); i++);
		if(i<n/2) res=false;
		return res;
		
	}
	public static void main(String[] args) {
		int num=14;
		System.out.println("Result-->"+ findPrimeOrNot(num));

	}

}
