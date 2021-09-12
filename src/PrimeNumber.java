
public class PrimeNumber {
	// 2 is lowest prime number

	public static void main(String[] args) {

		int n = 0,counter;
		String primeNumbers = "";
		int num = 100;
		for (int i = 1; i <= num; i++) {
			counter = 0;
			for (n = i; n >= 1; n--) {
				if (i % n == 0)
					counter++;
			}
			if (counter == 2)
				primeNumbers = primeNumbers + i + " ";

		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}