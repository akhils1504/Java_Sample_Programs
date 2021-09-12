import java.util.HashSet;
import java.util.Set;

public class DuplStr {
	public static void main(String argu[]) {

		String str = "malayalaaam fddfg   djd";
		char[] inp = str.toCharArray();

		Set<Character> e = new HashSet<>();

		System.out.println("Duplicate Characters are:");
		for (int i = 0; i < str.length(); i++) {
			if (!e.contains(inp[i])) {
				int counter = 1;
				for (int j = i + 1; j < str.length(); j++) {

					if (inp[i] == inp[j]) {
						counter++;

					}
				}
				System.out.println(inp[i] + "=" + counter);
				e.add(inp[i]);
			}
		}
	}
}
//set ,list diff