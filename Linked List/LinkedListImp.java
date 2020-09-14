package com.Tech;

public class LinkedListImp {

    Node Head = null;

    public void menu() {
        System.out.println("-----------------------------------------------------\n" +
                "MENU for Linked List Implementation:\n" +
                "-----------------------------------------------------\n" +
                "1.Add Element to List\n" +
                "2.Add Element at First\n" +
                "3.Add Element at Last\n" +
                "4.Add Element at Index\n" +
                "5.Remove Element by data\n" +
                "6.Remove Element by index\n" +
                "7.Remove Element at First\n" +
                "8.Remove Element at Last\n" +
                "9.Display Linked List\n" +
                "10.Size of LinkedList\n" +
                "11.Search the Element\n" +
                "-----------------------------------------------------");
    }

    public Node createNode(String data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        return node;
    }

    public void add(String data) {
        Node n = createNode(data);

        if (Head == null) {
            Head = n;
        } else {
            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println("Added " + n.data);
    }

    public void addFirst(String data) {
        Node n = createNode(data);

        if (Head != null) {
            n.next = Head;
        }
        Head = n;
        System.out.println("Added " + data + " to Front");
    }

    public void addAt(int index, String data) {
        Node n = createNode(data);

        if (index == 0 || index == 1) {
            addFirst(data);
        } else {
            Node temp = Head;
            Node tempNext;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            tempNext = temp.next;
            temp.next = n;
            n.next = tempNext;
        }
        System.out.println("Added " + n.data + " at index " + index);
    }

    public void remove(String data) {
        Node temp = Head;
        Node tempPrev = null;
        if (isEmpty()) {
            System.out.println("Linked list is Empty");
            return;
        }
        if (Head.next == null) {
            Head = null;
        } else {
            while (temp.data.equals(data)) {
                tempPrev = temp;
                temp = temp.next;
            }
            assert tempPrev != null;
            tempPrev.next = temp.next;
        }
        System.out.println("Removed " + data);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list is Empty");
            return;
        }
        if (Head == null) {
            System.out.println("Nothing to remove, Linked List is Empty");
        } else if (Head.next == null) {
            System.out.println("Removed " + Head.data);
            Head = null;
        } else {
            System.out.println("Removed " + Head.data);
            Head = Head.next;
        }
    }

    public void removeLast() {
        Node temp = Head;
        Node tempPrev = new Node();
        if (isEmpty()) {
            System.out.println("Linked list is Empty");
            return;
        }
        if (Head.next == null) {
            System.out.println("Removed " + Head.data);
            Head = null;
        } else {
            while (temp.next != null) {
                tempPrev = temp;
                temp = temp.next;
            }
            System.out.println("Removed " + temp.data);
            tempPrev.next = null;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list is Empty");
            return;
        }
        Node temp = Head;
        Node tempNext;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        tempNext = temp.next;
        temp.next = tempNext.next;
        System.out.println("Removed " + tempNext.data + " at index " + index);
    }

    public int search(String data) {
        Node temp = Head;
        int index = 0;
        while (!temp.data.equals(data)) {
            temp = temp.next;
            index++;
        }
        return index;
    }

    public int size() {
        Node temp = Head;
        int size = 0;
        if (Head == null) {
            return 0;
        } else {
            while (temp.next != null) {
                temp = temp.next;
                size++;
            }
            return size + 1;
        }
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public void show() {
        Node temp = Head;
        System.out.println("size: " + size());
        if (Head == null) {
            System.out.println("No data to Display/Show");
            return;
        }
        while (temp.next != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(temp.data + "\n");
    }
}

/*
MENU for Linked List Implementation:
1.Add Data to linked List
2.Add Data at First to linked List
3.Add Data at Last to linked List
4.Add Data at Specified Index to linked List
5.Remove Data from Linked List
6.Remove Data by Specified index from Linked List
7.Remove Data at First from Linked List
8.Remove Data at Last from Linked List
9.Display Data Linked List
10.Size of LinkedList
11.Search the Data from Linked List
*/
