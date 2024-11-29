public class recursionSort {
    public static void main(String[] args) {

        var org = "babbab";
        var res = orderCharGroups(org);
        System.out.println("Org: %s".formatted(org));
        System.out.println("Res: %s".formatted(res));
    }

    private static String orderCharGroups(String text) {
        System.out.println("Text: %10s".formatted(text));
        if(text.length() < 2) {
            return text;
        }
        else {
            var t = text.charAt(0);
            var ordered = orderCharGroups(text.substring(1));
            System.out.println("Ordered 1: %10s t: %c".formatted(ordered, t));
            var o = ordered.charAt(0);
            if(t <= o) {
                ordered = t + ordered;
            }
            else {
                ordered = ordered + t;
            }

            System.out.println("Ordered 2: %10s".formatted(ordered));
            return ordered;
        }
    }
}
