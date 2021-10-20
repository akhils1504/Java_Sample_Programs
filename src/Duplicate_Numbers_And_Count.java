import java.util.HashMap;

public class Duplicate_Numbers_And_Count {

	public static void main(String[] args) {
		int number = 199, d = 0;
		HashMap<Integer, Integer> counter = new HashMap<>();

		while (number != 0) {// 198
			d = number % 10;// 8

			if (counter.containsKey(d))
				counter.put(d, counter.get(d) + 1);
			else
				counter.put(d, 1);
			number = number / 10;
		}
		System.out.println(counter);
	}

}
// https://www.youtube.com/watch?v=KRMhsl80Xag&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=111&ab_channel=NaveenAutomationLabs