public class Compare {

    public void twoStrings(String str1, String str2) {
        int result = str1.compareToIgnoreCase(str2);
        if (result < 0) {
            System.out.printf("\"%s\" is less than \"%s\"%n", str1, str2);
        } else if (result == 0) {
            System.out.printf("\"%s\" is equal to \"%s\"%n", str1, str2);
        } else {
            System.out.printf("\"%s\"\" is greater than \"%s\"%n", str1, str2);
        }
    }

}
