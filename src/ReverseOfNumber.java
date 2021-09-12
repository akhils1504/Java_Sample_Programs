
public class ReverseOfNumber {

	public static void main(String[] args) {
		int num = 123, j = 0;
		while (num != 0) { // 123,12,1
			j = (j * 10) + (num % 10); // 3,32,321
			num = num / 10; // 12,1,0

		}
		System.out.println("Reverse is " + j);
	}

}
