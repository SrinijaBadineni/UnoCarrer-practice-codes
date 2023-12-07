package first.program;

public class MethodType3 {
	static float dollarInRupees() {
		return 87.45f;
	}
	static String indiaCapital() {
		return "Delhi";
	}

	public static void main(String[] args) {
		// Method type 3
		//no args... return
		float dollar=100;
		float rupees=dollar*dollarInRupees();
		System.out.println("Indian rupees="+rupees);
		System.out.println("Indian capital="+indiaCapital());
		
	}

}
