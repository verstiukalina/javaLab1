import java.util.Scanner;

public class LabFourth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = in.nextLine();
        String result = "";
        char first = 0;
        boolean newWord = true;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (!Character.isLetter(letter)) {
                result = result + letter;
                newWord = true;
            } else if (newWord) {
                result = result + letter;
                first = Character.toLowerCase(letter);
                newWord = false;
            } else if (Character.toLowerCase(letter) != first) {
                result = result + letter;
            }
        }

        System.out.println("Результат:");
        System.out.println(result);

        in.close();
    }
}