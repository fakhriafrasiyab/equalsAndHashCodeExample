import java.util.Scanner;

public class SplitedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        for (String w : s.split("[ !,?.\\\\_'@]", 0)) {
//            System.out.println(w);
//        }
        if (s.trim().length()==0 || s.trim().length()>400000)
        {
            System.out.println(0);
            return;
        }
        String words[]=s.trim().split("[ !,?.\\_'@]+");
        //String delims = "[ !,?.\\\\_'@]+";
        //String[] tokens = s.split(delims);
        System.out.println(words.length);
        for (String word:words){
            System.out.println(word);
        }
        scan.close();
    }
}
