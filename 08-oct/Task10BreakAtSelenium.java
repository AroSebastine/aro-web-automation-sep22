package assignments;

public class Task10BreakAtSelenium{

	public static void main(String[] args) {
		
		String[] programmingLanguauges = new String[]{"Java", "JavaScript", "Selenium", "Python", "Mukesh"};

		for (String programmingLanguage : programmingLanguauges) {
			if (programmingLanguage.equals("Selenium")) {
				break;
			}
			System.out.println(programmingLanguage);
		}					
	}
}