import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisiblSumPairs {

    public static int divisibleSumPairs(int k, List<Integer> ar) {
        //Collections.sort(ar);
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                int sum = ar.get(i) + ar.get(j);
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//[1, 3, 2, 6, 1, 2]
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(6);
        nums.add(1);
        nums.add(2);
        divisibleSumPairs(3, nums);
    }
}
