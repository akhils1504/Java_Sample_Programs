import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterHashMap {

	public static void main(String[] args) {
		String s = "test";
        String arr[] = s.replaceAll(" ", "").split("");  //{"t","e","s","t"}
        //for refrence  String ar[]={"t","e","s","t"};
        HashMap<String, Integer> counts = new HashMap<>(); //only memory allocation no data will be created 
        for(String ch : arr) {// "t",
            if(counts.get(ch) == null) {  //
                counts.put(ch, 0);//(t,0)
            }
            counts.put(ch, counts.get(ch) + 1);//(t,1)(t,2)
        }
        System.out.println(counts);
	}

}

//not working when adding space and extra word

//havent used naveens code...used aruns code
//https://www.youtube.com/watch?v=ooYQ7lm6Xxk&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=36&ab_channel=NaveenAutomationLabs