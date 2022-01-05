public class LoopArray {
	
	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "jihong";
		users[1] = "kyungmin";
		users[2] = "joonhe";
		
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i]+ ",");
		}
	}
}