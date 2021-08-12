import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverseArray {

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> rev = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            rev.add(a.get(i));
        }
        return rev;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        System.out.println(Arrays.toString(new List[]{arr}));
        reverseArray(arr);
    }

}
