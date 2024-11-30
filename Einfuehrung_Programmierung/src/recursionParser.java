public class recursionParser {
    public static void main(String[] args) {
        System.out.println(squeeze("Test", 'e'));
    }
    private static String squeeze(String s, char c) {
        if (s.isEmpty()) {
            return s;
        }
        if (s.charAt(0) == c) {
            return squeeze(s.substring(1), c);
        }
        return s.charAt(0) + squeeze(s.substring(1), c);
    }
}
