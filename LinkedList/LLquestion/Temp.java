package com.LinkedList.LLquestion;

public class Temp {
    int value;
    Temp next;

    public Temp(int value, Temp next) {
        this.value = value;
        this.next = next;
    }
    public Temp(int value) {
        this.value = value;
    }
    public Temp() {
    }

    public void insertLast(int value, Temp tail, Temp head){
        Temp node = new Temp();
        if (head==null){
            head=node;
            node.value=value;
            return;
        }
        tail.next=node;
        node.value=value;
        node.next=null;
        tail=node;
        return;
    }
    public void display(Temp head){
        Temp current = head;
        if(head == null) System.out.println("List is empty");
        System.out.println("Nodes of singly LinkedList : ");
        while (current!=null){
            System.out.println(current.value);
            current=current.next;
        }
        return;
    }

    public static void main(String[] args) {
        Temp node = new Temp();
//        node.insertLast(85);
//        node.insertLast(84);
//        node.insertLast(83);
//        node.insertLast(82);
//        node.insertLast(81);
//        node.display();
        Temp head = node;
        Temp tail = node;

    }
}
