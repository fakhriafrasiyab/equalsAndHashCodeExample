import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotLeft(int d, List<Integer> ar) {
        int[] a = new int[ar.size()];
        for (int i=0; i < a.length; i++)
        {
            a[i] = ar.get(i).intValue();
        }
        int length = a.length;
        List<Integer> temp = new ArrayList<>();
        int j = 0;
        for (int i = d; i < length; i++, j++) {
            temp.add(j,a[i]);
        }
        for (int i=0;i<d;i++,j++){
            temp.add(j,a[i]);
        }
        //System.out.println(Arrays.toString(temp.toArray()));
        return temp;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        rotLeft(4, a);
    }
}
