package com.Tech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedListImp linky = new LinkedListImp();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n\nMENU? Y/N");
            String s = sc.next();

            if (s.equals("Y") || s.equals("y")) {
                linky.menu();
                System.out.println("\nEnter your Choice to perform Operation on LinkedList");
            } else if (s.equals("N") || s.equals("n")) {
                break;
            } else {
                continue;
            }

            int choice = sc.nextInt();
            String data;
            int index;
            switch (choice) {
                case 1 -> {
                    System.out.print("\nEnter the Data to Add to Liked List: ");
                    data = sc.next();
                    linky.add(data);
                }
                case 2 -> {
                    System.out.print("\nEnter the Data to Add First: ");
                    data = sc.next();
                    linky.addFirst(data);
                }
                case 3 -> {
                    System.out.print("\nEnter the Data to Add Last: ");
                    data = sc.next();
                    linky.add(data);
                }
                case 4 -> {
                    System.out.print("\nEnter the Data to Add: ");
                    data = sc.next();
                    System.out.print("\nEnter the Index of the Data to Add: ");
                    index = sc.nextInt();
                    linky.addAt(index, data);
                }
                case 5 -> {
                    System.out.print("\nEnter the Data to Remove: ");
                    data = sc.next();
                    linky.remove(data);
                }
                case 6 -> {
                    System.out.print("\nEnter the Index of Data to remove: ");
                    index = sc.nextInt();
                    linky.removeAt(index);
                }
                case 7 -> linky.removeFirst();
                case 8 -> linky.removeLast();
                case 9 -> linky.show();
                case 10 -> System.out.println("Size of Linked List is " + linky.size());
                case 11 -> {
                    System.out.println("Enter the Element to Search");
                    data = sc.next();
                    System.out.println("Element found at position " + linky.search(data));
                }
                default -> System.out.println("Enter the valid Choice");
            }
        }
    }
}
