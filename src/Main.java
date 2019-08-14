import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //#1
        Calendar date = new GregorianCalendar();
        int dateNow = date.get(DAY_OF_WEEK);

        switch (dateNow) {
            case MONDAY:
                System.out.println("Today is: " + Days.Monday);
                break;
            case TUESDAY:
                System.out.println("Today is: " + Days.Tuesday);
                break;
            case WEDNESDAY:
                System.out.println("Today is: " + Days.Wednesday);
                break;
            case THURSDAY:
                System.out.println("Today is: " + Days.Thursday);
                break;
            case FRIDAY:
                System.out.println("Today is: " + Days.Friday);
                break;
            case SATURDAY:
                System.out.println("Today is: " + Days.Saturday);
                break;
            case SUNDAY:
                System.out.println("Today is: " + Days.Sunday);
                break;
        }

        //#2
        System.out.println(Fruits.getRandom());

        //#3
        BufferedReader symb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        long num = Long.parseLong(symb.readLine());
        if (Automorphic.isAutomorphic(num)) {
            System.out.println("Automorphic number.");
        } else {
            System.out.println("Not an automorphic number.");
        }

        //#4
        HappyNumbers.happy();

        //#5
        new Compare().twoStrings("Strings are so cool", "Strings are so cool!");

        //#6
        new Replace().replaced();

        //#7
        var reversedString = new Reverser().reverseString("Strings are so cool!");
        System.out.println(reversedString);

    }
}
