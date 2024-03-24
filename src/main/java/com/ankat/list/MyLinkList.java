package com.lti.list;

class Node{
    public int data;
    public Node next;
}


class LinkList{
    Node head;

    public void add(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head ==null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void printList(){
        Node n = head;
        while (n.next != null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
}
public class MyLinkList {

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.add(24);
        ll.add(12);
        ll.add(67);

        ll.printList();
    }
}
