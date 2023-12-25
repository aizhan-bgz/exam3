package task4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Mother", "мама");
        map.put("School", "школа");

        System.out.println(map.get("Mother"));
        System.out.println(map.get("School"));

    }
}
