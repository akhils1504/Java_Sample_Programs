
public class Fibonaci {
	// 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		int i = 1, t1 = 0, t2 = 1, n = 10, sum = 0;
		while (i <= n) {
			System.out.println(t1);
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			i++;
		}
	}

}
