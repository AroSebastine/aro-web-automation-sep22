package assignments;

public class Task8PrintScoreAbove80{

	public static void main(String[] args) {
		
		int [] marks = {78,12,89,55,35};
		
		for (int mark : marks) {
			if (mark > 80) {
				System.out.println(mark);
			}
		}					
	}
}