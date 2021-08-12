import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayLeftRotation {
    //my code some problems in some cases
//    public static List<Integer> rotLeft(List<Integer> a, int d) {
//        List<Integer> answer = new ArrayList();
//        List<Integer> temp = new ArrayList();
//        for (int i = 0; i < d; i++) {
//            temp.add(a.get(i));
//        }
//
//        for (int i = 0; i < a.size() - 1; i++) {
//            a.set(i, a.get(i + 1));
//        }
//
//        for (int i = 0; i < a.size(); i++) {
//            System.out.print(a.get(i) + "  ");
//        }
//
//        for (int i = a.size() - 1; i >= d; i--) {
//            for (int j = d - 1; j >= 0; j--) {
//                if (i == j + d) {
//                    a.set(i, temp.get(j));
//                }
//            }
//        }
////        for (int i = 0; i < temp.size(); i++) {
////            System.out.print(temp.get(i) + "  ");
////        }
//        return a;
//    }

    //another code doesnt work in only one case
//    public static List<Integer> rotLeft(List<Integer> a, int d) {
//        int n = a.size();
//        for (int i = 0; i < d; i++)
//            leftRotatebyOne(a);
//        return a;
//    }
//
//    public static List<Integer> leftRotatebyOne(List<Integer> a) {
//        int n = a.size();
//        int i, temp;
//        temp = a.get(0);
//        for (i = 0; i < n - 1; i++)
//            a.set(i, a.get(i + 1));
//        a.set(n - 1, temp);
//        return a;
//    }
//    public static void printArray(List<Integer> a)
//    {
//        for (int i = 0; i < a.size(); i++)
//            System.out.print(a.get(i) + " ");
//    }
    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int j = 0;
        int[] temp = new int[length];

        for (int i = d; i < length; i++, j++) {
            temp[j] = a[i];
        }
        System.out.println(Arrays.toString(temp));
        if (j < length) {
            for (int i = 0; i < d; i++, j++) {
                temp[j] = a[i];
            }
        }

        return temp;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        rotLeft(a, 4);
    }
}
