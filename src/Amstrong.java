public class Amstrong {

	public static void main(String[] args) {
		// 151=1*1*1 5*5*5 1*1*1
		int r, temp, cube = 0;
		int num = 153;
		temp = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = (r * r * r) + cube;

		}
		if (cube == temp)
			System.out.println("This is Amstrong");

	}

}
