import java.util.Scanner;

public class MultiplesOf3and5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for (int i = 0; i < t; i++) {
            long n = in.nextLong();
            long sum = 0;
            long multiplesOfThree = (n - 1) / 3;
            multiplesOfThree = 3 * multiplesOfThree * (multiplesOfThree + 1) / 2;

            long multiplesOfFive = (n - 1) / 5;
            multiplesOfFive = 5 * multiplesOfFive * (multiplesOfFive + 1) / 2;

            long multiplesOfBoth = (n - 1) / 15;
            multiplesOfBoth = 15 * multiplesOfBoth * (multiplesOfBoth + 1) / 2;

            sum = multiplesOfThree + multiplesOfFive - multiplesOfBoth;
            System.out.println(sum);

        }
    }
}
