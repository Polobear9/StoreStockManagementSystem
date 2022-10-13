package StoreItemAndStock;

import java.util.Scanner;

public class StoreMenu {
    static Scanner sc = new Scanner(System.in);
    static Integer menuId = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter The Menu number.");
            System.out.println("1.Store Start");
            System.out.println("2.Store Item Check and Stock");
            System.out.println("3.Exit");

            menuId = sc.nextInt();
            switch (menuId) {
                case 1:
                    while (true) {
                        System.out.println("1.Store Start");
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("2.Store Item Check and Stock ");
                        break;
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("3.Exit");
                        break;
                    }
                    break;
            }
        }
    }
}
