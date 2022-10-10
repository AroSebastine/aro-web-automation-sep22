package assignments;

public class Task9BreakAt85{

	public static void main(String[] args) {
		
		int [] marks = {12,34,66,85,900};
	
		for (int mark : marks) {
			if (mark == 85) {
				break;				
			}
			System.out.println(mark);
		}					
	}
}
