import java.util.Arrays;

public class MinimumSwaps {
    static int minimumSwaps(int[] arr) {

        int count = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//                i=-1;
//                count++;
//            }
//        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                count++;
            }else{
                i++;
            }
        }
        //System.out.println(count);
        //System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void main(String[] args) {
        minimumSwaps(new int[]{1, 3, 5, 2, 4, 6, 7});

        int i=0x000F;
        int j=0x2222;
        System.out.println(i&j);
    }
}
