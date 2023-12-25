package task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        users.add(new User("Aizhan", 24));
        users.add(new User("Shirin", 19));
        users.add(new User("Daniil", 18));
        users.add(new User("Alina", 20));

        for (User i:users) {
            System.out.println(i.getName() + ", age: " + i.getAge());
            names.add(i.getName());
            ages.add(i.getAge());
        }

        Collections.sort(ages);
        System.out.println(ages);

        Collections.sort(names);
        System.out.println(names);


    }
}
