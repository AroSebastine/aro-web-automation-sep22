package assignments;

public class Task6PrintPrimeNumbers{

	public static void main(String[] args) {
		
		int numberOfPrimeNumbers = 0;
		
		for (int numberToCheck = 2; numberToCheck <= 100; numberToCheck++) {
			
			boolean isPrimeNumber = true;
			
			if (numberToCheck == 2) {
				System.out.println(numberToCheck);
				numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
			}
			else if (numberToCheck ==3) {
				System.out.println(numberToCheck);
				numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
			}
			
			else {
				for (int factor = 2; factor <= numberToCheck/2; factor++) {
					
					if (numberToCheck % factor == 0) {
						isPrimeNumber = false;
						break;
					}									
				}	
				if (isPrimeNumber) {
					System.out.println(numberToCheck);
					numberOfPrimeNumbers = numberOfPrimeNumbers + 1;
				}			
			}			
		
		}
		System.out.println("Total number of prime numbers: " + numberOfPrimeNumbers);
	}

}
