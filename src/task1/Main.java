package task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Inventory> inventories = new HashMap();

        Inventory inv1 = new Inventory("notebook");
        Inventory inv2 = new Inventory("smartphone");
        Inventory inv3 = new Inventory("TV");

        inventories.put(inv1.getName(), inv1);
        inventories.put(inv2.getName(), inv2);
        inventories.put(inv3.getName(), inv3);

        System.out.println("Товары: ");
        for (String i:inventories.keySet()) {
            System.out.println(i);
        }
        System.out.println("");

        inventories.remove("notebook");
        System.out.println("Товары после удаления: ");
        for (String i:inventories.keySet()) {
            System.out.println(i);
        }

        System.out.println();

        Boolean isAvailable = inventories.containsKey("notebook");

        try {
            if (isAvailable) System.out.println("В наличии");
            isAvailableMethod(isAvailable);
        }
        catch (Exception e){
            System.err.println("Нет в наличии");
        }

    }
    public static void isAvailableMethod (Boolean isAvailable) throws Exception {
        if (!isAvailable)
            throw new Exception();
    }

}
