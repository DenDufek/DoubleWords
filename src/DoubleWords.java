import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Крок 1: Введення слів із клавіатури
        List<String> words = new ArrayList<>();
        System.out.println("Введіть 5 слів:");
        for (int i = 0; i < 5; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        // Крок 2: Підвоєння слів
        doubleValues(words);

        // Крок 3: Виведення результату
        System.out.println("Результат:");
        for (String doubledWord : words) {
            System.out.println(doubledWord);
        }
    }

    // Метод для підвоєння слів у списку
    private static void doubleValues(List<String> list) {
        List<String> doubledList = new ArrayList<>();
        for (String word : list) {
            doubledList.add(word);
            doubledList.add(word);
        }
        list.clear();
        list.addAll(doubledList);
    }
}
