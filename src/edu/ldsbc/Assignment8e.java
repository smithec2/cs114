package edu.ldsbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment8e {
    /**
     * @author Craig Smith
     * Using an ArrayList create a shopping list application.  The user needs to be able to add to the list, change an item in the list, delete an item in the list, clear the list, and output to the screen all items in the list. Do not at this time worry about how to save the list permanently.
     * <p>
     * Create a text menu that looks like the following (the text menu should redisplay after any action has been taken):
     * <p>
     * 1) Add Item
     * 2) Change Item
     * 3) Delete Item
     * 4) Output List
     * 5) Clear List
     */

    static List<String> shoppingList = new ArrayList();

    public static void main(String[] args) {

        while (true) {
            printOptions();
            exeOption(readOption());
        }

    }

    private static void exeOption(int i) {
        switch (i){
            case 1: {
                addItem();
                break;
            }
            case 2: {
                changeItem();
                break;
            }
            case 3: {
                deleteItem();
                break;
            }
            case 4: {
                printItems();
                break;
            }
            case 5: {
                printItems();
                break;
            }
        }
    }

    private static void deleteItem() {
        printItems();
    }

    private static void printItems() {
        int i =1;
        for (String str:shoppingList)
            System.out.println(i+ " )" + str);
    }

    private static void changeItem() {

    }

    private static void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add Item:");
        shoppingList.add(scanner.nextLine());
    }

    private static int readOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printOptions() {
        System.out.println("1) Add Item");
        System.out.println("2) Change Item");
        System.out.println("3) Delete Item");
        System.out.println("4) Output List");
        System.out.println("5) Clear List");

    }


}
