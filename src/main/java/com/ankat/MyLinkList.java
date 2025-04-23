package com.ankat;

class Node1 {
    public int data;
    public Node1 next;
}


class LinkList{
    Node1 head;

    public void add(int data){
        Node1 node1 = new Node1();
        node1.data = data;
        node1.next = null;

        if(head ==null){
            head = node1;
        }else{
            Node1 n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node1;
        }
    }

    public void printList(){
        Node1 n = head;
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
