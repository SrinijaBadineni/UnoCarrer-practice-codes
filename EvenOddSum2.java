package first.program;

public class EvenOddSum2 {

	public static void main(String[] args) {
		int eSum=0,oSum=0;
	       for(int num=1;num<=10;num++) 
	       {
	         if(num % 2 == 0) 
	         {
	       	  eSum = eSum + num;	
	       	 }
	       	else {
	       	 oSum = oSum +num;	
	       	    }
	       }
	    System.out.println("Total Even Sum--->"+eSum);
	    System.out.println("Total Odd Sum--->"+oSum);
	}

}
