
public class ReverseOfAString {

	public static void main(String[] args) {
		String input = "Akhil";
		char[] st = input.toCharArray();
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.println(st[i]);
		}
	}

}
