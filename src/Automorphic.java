public class Automorphic {

    public static boolean isAutomorphic(long number) {
        return Long.toString(number * number)
                .endsWith("" + number);
    }
}