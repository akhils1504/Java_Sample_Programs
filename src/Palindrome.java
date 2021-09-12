
public class Palindrome {

	public static void main(String[] args) {
		// 151 454 878
		int r, sum = 0, temp;
		int num = 151;
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (sum == temp)
			System.out.println("This is palindrome");

	}

}
