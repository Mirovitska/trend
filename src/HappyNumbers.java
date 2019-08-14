import java.util.HashSet;

public class HappyNumbers {

    public static void happy() {
        System.out.println("First 10 Happy numbers:");
        for (long num = 1, count = 0; count < 10; num++) {
            if (happy_num(num)) {
                System.out.println(num);
                count++;
            }
        }
    }

    public static boolean happy_num(long num) {
        HashSet<Long> cycle = new HashSet<Long>();
        while (num != 1 && cycle.add(num)) {
            long m = 0;
            while (num > 0) {
                int digit = (int) (num % 10);
                m += digit * digit;
                num /= 10;
            }
            num = m;
        }
        return num == 1;
    }
}
