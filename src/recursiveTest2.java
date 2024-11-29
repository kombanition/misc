public class recursiveTest2 {
    public static void main(String[] args) {
        recursiveParser("Das hier ist ein Test");
    }
    private static void recursiveParser(String text){
        if (text.isEmpty()) return;
        System.out.print(text.charAt(0));
        recursiveParser(text.substring(1));
        }
    }

