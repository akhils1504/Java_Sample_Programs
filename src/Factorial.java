public class Factorial {

	public static void main(String[] args) {
		long f = 1;
		int num = 3;
		for (int i = 1; i <= num; ++i) {
			f = f * i;
		}
		System.out.printf("Factorial of %d = %d", num, f);
	}
}