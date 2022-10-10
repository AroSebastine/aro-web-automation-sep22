package assignments;

public class Task7PrintStarPattern{

	public static void main(String[] args) {
		
		int numberOfLines = 6;
		String stars = "";
		char star = '*';
		int numberOfStarsToPrint = 1;		
		
		while (numberOfStarsToPrint <= numberOfLines) {
			stars = stars + star;
			System.out.println(stars);
			numberOfStarsToPrint++;
		}		
	}
}
