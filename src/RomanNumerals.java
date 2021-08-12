import java.util.HashMap;

public class RomanNumerals {
    public static void main(String[] args) {
        HashMap<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("m", 5000);
    }
}
