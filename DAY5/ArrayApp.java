public class ArrayApp {
	
	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "abc";
		users[1] = "def";
		users[2] = "ghi";
		
		System.out.println(users[1]);
		System.out.println(users.length);
		
		int[] scores = {10, 100, 100};
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}
}