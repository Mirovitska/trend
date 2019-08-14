public class Reverser {

    String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        final int length = s.length();
        for (int offset = length - 1; offset >= 0; ) {
            final int codepoint = s.codePointAt(offset);
            sb.append(Character.toString(codepoint));
            offset -= Character.charCount(codepoint);
        }
        return sb.toString();
    }
}
