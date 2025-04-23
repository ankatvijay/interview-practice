package com.lti.list;

class SingleNode<T> {
    T data;
    SingleNode<T> next;
}

public class SingleLinkList<T> {

    SingleNode<T> head;

    public void add(T data) {
        SingleNode<T> node = new SingleNode<>();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            SingleNode<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void addFirst(T data) {
        SingleNode<T> node = new SingleNode<>();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void addLast(T data) {
        SingleNode<T> node = new SingleNode<>();
        node.data = data;
        node.next = null;

        SingleNode<T> n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    public void addAtIndex(int index, T data) {
        SingleNode<T> node = new SingleNode<>();
        node.data = data;
        node.next = null;

        if (head == null) {
            addFirst(data);
        } else {
            SingleNode<T> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            SingleNode<T> node = head.next;
            head = null;
            head = node;
        }
    }

    public void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            SingleNode<T> n = head;
            while (n.next.next != null) {
                n = n.next;
            }
            n.next = null;
        }
    }


    public void deleteAtIndex(int index) {
        SingleNode<T> n = head;
        SingleNode<T> temp = null;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        temp = n.next;
        n.next = temp.next;
    }

    public void print(String printFor) {
        System.out.println("//--- " + printFor + " ---//");
        if (head == null) {
            System.out.println("//--- Empty SingleLinkList ---//");
        } else {
            SingleNode<T> n = head;
            while (n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
    }
}
