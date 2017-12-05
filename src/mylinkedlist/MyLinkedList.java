/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

/**
 *
 * @author Nishantc
 */
public class MyLinkedList {

    private Node head;
    private int length;

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        if (head == null) {
            head = new Node();
            head.setValue(value);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
        length++;
    }

    public void removeTail() {
        if (head != null) {
            Node prev = head;
            Node temp = head.getNext();
            if (temp != null) {
                while (temp.getNext() != null) {
                    prev = temp;
                    temp = temp.getNext();
                }
                prev.setNext(null);
            } else {
                head = null;
            }
            System.out.println("Last element removed from list");
            length--;
        } else {
            System.out.println("Your list is empty.");
        }
    }

    public void displayAll() {
        Node node = head;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }

    public void deleteByPosition(int position) {
        if (head == null) {
            head = null;
        } else if (position == 0) {
            head = head.getNext();
        } else {
            Node n = head;
            displayAll();
            for (int i = 0; i < position - 1; i++) {
                n = n.getNext();
            }
            n.setNext(n.getNext().getNext());
        }
    }

    public void removeGreaterElement(int targetValue) {
        Node node = head;
        int counter = 0;
        while (node != null) {
            if (node.getValue() > targetValue) {
                counter++;
            }
            node = node.getNext();
        }
        for (int i = 0; i <= counter; i++) {
            node = null;
            displayAll();
            node = head;
            int index = 0;
            while (node != null) {
                if (node.getValue() > targetValue) {
                    deleteByPosition(index);
                    length--;
                    break;
                }
                index++;
                node = node.getNext();
            }
        }
    }
}
