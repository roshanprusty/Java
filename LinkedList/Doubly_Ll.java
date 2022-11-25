package com.LinkedList;

public class Doubly_Ll {
    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public int size=0;
    public Node head=null;
    public Node tail=null;

    public void insertFirst(int value){
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;


        }
        else {
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void insertMid(int pos, int value){
        if(pos==0) {
            insertFirst(value);
            return;
        }
        if(pos==size) {
            insertLast(value);
            return;
        }
        Node newNode = new Node(value);
        Node currentNode = head;
        for (int i = 0; i <pos-2; i++) {
            currentNode=currentNode.next;
        }
        newNode.next=currentNode.next;
        newNode.prev=currentNode;
        currentNode.next=newNode;

        //going two node ahead to give previous node location
        currentNode=currentNode.next.next;
        currentNode.prev=newNode;

        size++;
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        Node currentNode = tail;
        currentNode.next=newNode;
        newNode.prev=currentNode;
        tail=newNode;

        size++;

    }

    public void display(){
        Node current=head;
        if(head == null) System.out.println("List is empty");
        System.out.println("Nodes of singly LinkedList : ");
        while (current != null){
            System.out.print(current.value+" -> ");
            current=current.next;
        }
        System.out.println("END");

    }
    public void displayReversal(){
        Node currentNode = tail;
        if(head == null) System.out.println("List is empty");
        System.out.println("Nodes of Doubly LinkedList : ");
        for (int i = size; i >0 ; i--) {
            System.out.print(currentNode.value+" -> ");
            currentNode=currentNode.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Doubly_Ll doubly = new Doubly_Ll();
        doubly.insertFirst(24);
        doubly.insertFirst(78);
        doubly.insertFirst(88);
        doubly.insertFirst(100);
        doubly.insertLast(1);
        doubly.display();
        doubly.insertMid(2,177);

        doubly.display();
        doubly.displayReversal();
    }


}
