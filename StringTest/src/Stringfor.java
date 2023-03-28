import java.util.Scanner;

public class Stringfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string:");
        String str = sc.next();
        //count
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //System.out.println(c);
            if (c>='a'&& c<='z') {
                smallcount=smallcount+1;
            } else if (c>='0'&&c<='9') {
                numbercount = numbercount+1;
            } else if (c>='A'&&c<='Z') {
                bigcount = bigcount+1;
            }
        }
        System.out.println("big:"+bigcount);
        System.out.println("small:"+smallcount);
        System.out.println("number:"+numbercount);
    }
}
