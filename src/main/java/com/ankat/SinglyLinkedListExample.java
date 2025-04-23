package com.ankat;

class Node<T> {
    T data;
    Node<T> next;
}

class SinglyLinkedList<T> {
    Node<T> head;

    void add(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    void addFirst(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;
    }

    void add(int index, T data) {
        Node<T> node = new Node<>();
        node.data = data;
        if (index < 0) {
            throw new RuntimeException("Invalid index, index should not be less then 0");
        } else if (index == 0) {
            addFirst(data);
        } else {
            int i = 0;
            Node<T> last = head;
            while (last.next != null) {
                ++i;
                if (i == index) {
                    node.next = last.next;
                    last.next = node;
                    break;
                }
                last = last.next;
            }
            if (index > i) {
                if ((index - i) == 1) {
                    addLast(data);
                } else {
                    throw new RuntimeException("Invalid index, index should not be less then list size");
                }
            }
        }
    }

    void addLast(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;

        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
    }

    boolean removeFirst() {
        if(head == null){
            throw new RuntimeException("List is empty");
        }else{
            if(head.next == null){
                head = null;
            }else {
                while(head.next != null){

                }
            }
        }
        return false;
    }

    void clear() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (head == null) {
            sb.append("List is empty");
        } else {
            Node<T> last = head;
            while (last.next != null) {
                sb.append(String.format("[data: %s,next: %s],", last.data, last.next));
                last = last.next;
            }
            sb.append(String.format("[data: %s,next: %s]", last.data, last.next));
        }
        return sb.toString();
    }
}

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        System.out.println("//--- String Linked List ");
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();
        stringList.add("apple"); // ["apple"]
        stringList.add("banana"); // ["apple","banana"]
        stringList.add("chiku"); // ["apple","banana","chiku"]
        System.out.println(stringList);
        stringList.addFirst("date"); // ["date,""apple","banana","chiku"]
        System.out.println(stringList);
        stringList.addLast("emblica"); // ["date,""apple","banana","chiku", "emblica"]
        System.out.println(stringList);
        stringList.add(2, "peru"); // ["date,""apple","peru","banana","chiku", "emblica"]
        System.out.println(stringList);


        SinglyLinkedList<Integer> integerList = new SinglyLinkedList<>();
        integerList.add(25); // [25]
        integerList.add(12); // [25,12]
        integerList.add(67); // [25,12,67]
        System.out.println(integerList);
        integerList.addFirst(44); // [44,25,12,67]
        System.out.println(integerList);
        integerList.addLast(8); // [44,25,12,67,8]
        System.out.println(integerList);
        integerList.add(2, 76); // [44,25,76,12,67,8]
        System.out.println(integerList);
        integerList.add(0, 29); // [29,44,25,76,12,67,8]
        System.out.println(integerList);

        integerList.add(7, 54); // [29,44,25,76,12,67,8,54]
        System.out.println(integerList);

        integerList.add(8, 30); // [29,44,25,76,12,67,8,54,30]
        System.out.println(integerList);

        integerList.add(10, 19); // [29,44,25,76,12,67,8,54,30] - Error while inserting record
        System.out.println(integerList);

    }
}
