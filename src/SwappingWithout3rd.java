
public class SwappingWithout3rd {

	public static void main(String[] args) {
		int a = 10, b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("First Varibale" + a);
		System.out.println("Second Variable" + b);
	}

}
