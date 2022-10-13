package StoreItemAndStock;

import java.util.HashMap;
import java.util.Scanner;

public class ItemRepository {

    static final Integer MAXITEMSIZE = 50;

    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> storeStock = new HashMap<>();

    public static void addItem(){
        String itemName = sc.nextLine();
        Integer itemStock = itemLimitCheck();
        storeStock.put(itemName, itemStock);
    }

    public static void removeItem(){
        String itemName = sc.nextLine();
        storeStock.remove(itemName);
    }

    public static void changeItemStock(){
        String itemName = sc.nextLine();
        Integer itemStock = itemLimitCheck();
        storeStock.replace(itemName, itemStock);
    }

    public static void checkItemStock(){
        String itemName = sc.nextLine();
        storeStock.get(itemName);
    }

    public static void findItems(){
        System.out.println(storeStock.values());
    }

    private static Integer itemLimitCheck() {
        Integer itemStock = sc.nextInt();
        while (itemStock <= MAXITEMSIZE) {
            System.out.println("please enter the Number again... number < 50");
            itemStock = sc.nextInt();
        }
        return itemStock;
    }

}
