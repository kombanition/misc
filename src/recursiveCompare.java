public class recursiveCompare {
    public static void main(String[] args) {
        System.out.println(compareString("abcdeabcd", "abcd"));
        System.out.println(compareString("abcjfgjdfghdgabc", "abc"));
        System.out.println(compareString("abcdeh", "abcd"));
    }

    private static boolean compareString(String text, String sequence) {
        if (sequence.isEmpty()) {
            return true;
        }
        if (text.length() < sequence.length() * 2) {
            return false;

        } else if (text.length() > 2) {
            if (text.charAt(0) == sequence.charAt(0) && text.charAt(text.length() - 1) == sequence.charAt(sequence.length() - 1)) {
                if (sequence.length() == 1) {
                    return true;
                }
                return compareString(
                        text.substring(1, text.length() - 1),
                        sequence.substring(1, sequence.length() - 1));
            }
        }
        return false;
    }
}
