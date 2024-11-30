public class EP1_2 {
    public static void main(String[] args) {
        int grade = 2;
        String text = "";

        switch(grade) {
            case 1:
                text = "Sehr gut";
                break;
            case 2:
                text = "Gut";
                break;
            case 3:
                text = "Befriedigend";
                break;
            case 4:
                text = "Genügend";
                break;
            case 5:
                text = "Nicht genügend";
                break;
        }
        System.out.println(text);
    }
}