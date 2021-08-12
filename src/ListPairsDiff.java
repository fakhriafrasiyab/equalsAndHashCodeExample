import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPairsDiff {
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;
        int i = 0;
        int j = 1;
        int n = arr.size();
        while (j < n) {
            int diff = arr.get(j) - arr.get(i);
            if (diff == k) {
                count++;
                j++;
            } else if (diff > k) {
                i++;
            } else if (diff < k) {
                j++;
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
        pairs( 3, nums);
    }
}
