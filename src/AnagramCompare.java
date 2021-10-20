


import java.util.Arrays;

public class AnagramCompare {
    public static void main(String[] args) {
        String a = "off";
        String b = "ofo";
        char[] aarray = a.toCharArray();
        Arrays.sort(aarray);
        char[] barray = b.toCharArray();
        Arrays.sort(barray);
        System.out.println(String.valueOf(aarray));//used to convert char to String
        System.out.println("Anagram: " + String.valueOf(aarray).equals(String.valueOf(barray)));
    }
} 