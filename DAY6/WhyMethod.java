public class WhyMethod {
	
	public static void main(String[] args) {
		
		//100000
		printTwoTimesA("a","-");
		
		//100000
		printTwoTimesA("a","*");
		
		//100000
		printTwoTimesA("a","-");
	}
	
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
}