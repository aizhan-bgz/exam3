package task4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("mother", "мама");
        map.put("school", "школа");
        map.put("job", "работа");
        map.put("family", "семья");

        Scanner scanner = new Scanner(System.in);
        String word =scanner.nextLine();

        System.out.println("Перевод слова " + word + " - " + map.get(word));
    }
}
