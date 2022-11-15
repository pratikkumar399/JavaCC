package lab;

import java.util.*;

public class stringList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Item to be inserted:");
                    String item = sc.next();
                    System.out.println();
                    list.add(item);
                    System.out.println("Item inserted successfully");
                    break;
                case 2:
                    System.out.println("Enter Item to search:");
                    item = sc.next();
                    System.out.println();
                    if (list.contains(item)) {
                        System.out.println("Item found in the list!!");
                    } else {
                        System.out.println("Item not found in the list!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Item to be deleted:");
                    item = sc.next();
                    System.out.println();
                    if (list.contains(item)) {
                        list.remove(item);
                        System.out.println("Item removed successfully!!");
                    } else {
                        System.out.println("Item do not exist!");
                    }
                    break;
                case 4:
                    Iterator itr = list.iterator();
                    System.out.println("Items of list are:");
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    break;
            }
        } while (choice != 5);
    }
}
