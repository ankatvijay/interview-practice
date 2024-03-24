package com.lti.list;

public class CustomListExample {

    public static void main(String[] args) {
        SingleLinkList<Integer> singleLinkList = new SingleLinkList<>();
        singleLinkList.add(24);
        singleLinkList.add(13);
        singleLinkList.add(37);
        // --- Print Single LinkList --- //
        singleLinkList.print("Print Single LinkList");

        singleLinkList.addFirst(18); // Add at first
        // --- Print Add at first LinkList --- //
        singleLinkList.print("Print Add at first LinkList");

        singleLinkList.addLast(49); // Add at last
        // --- Print Add at last LinkList --- //
        singleLinkList.print("Print Add at last LinkList");

        singleLinkList.addAtIndex(2,27); // Add at index
        // --- Print Add at index LinkList --- //
        singleLinkList.print("Print Add at index LinkList");

        singleLinkList.deleteFirst(); // Delete first index
        // --- Print Delete at first LinkList --- //
        singleLinkList.print("Print Delete at first LinkList");

        singleLinkList.deleteLast(); // Delete last index
        // --- Print Delete at last LinkList --- //
        singleLinkList.print("Print Delete at last LinkList");

        singleLinkList.deleteAtIndex(2); // Delete at index
        // --- Print Delete at index LinkList --- //
        singleLinkList.print("Print Delete at index LinkList");
    }
}
