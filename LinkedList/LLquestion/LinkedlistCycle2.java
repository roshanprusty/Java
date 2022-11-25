package com.LinkedList.LLquestion;
//https://leetcode.com/problems/linked-list-cycle-ii/
//tell from where cycle is starting;
public class LinkedlistCycle2 {
    class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value) {
            this.value = value;
        }
        public Node() {

        }
    }
    Node head = null;
    Node tail = null;

    public void insert(int value){
        Node node = new Node();
        if(head==null){
            node.value=value;
            head = node;
            tail=node;
            return;
        }
        tail.next=node;
        node.value=value;
        node.next=head;
        tail=node;
    }
    public void insertLast(int value){
        Node node = new Node();
        if(head==null){
            head=node;
            tail=node;
            node.value=value;
            return;
        }
        tail.next=node;
        node.value=value;
        node.next=null;
        tail=node;

    }
    public int cycleLength(){
        Node fast = head;
        Node slow = head;
        int length=0;
        while (fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp = fast;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=fast);
                return length;
            }

        }
        return length;
    }
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int length=0;
        while (fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                Node temp = fast;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=fast);
                break;
            }
        }
        if(length==0) return null;
        Node first = head;
        Node second = head;
        while (length>0){
            first=first.next;
            length--;
        }
        while (first!=second){
            first=first.next;
            second=second.next;
        }
        return first;
    }

    public static void main(String[] args) {
        LinkedlistCycle2 ll2 = new LinkedlistCycle2();
        ll2.insertLast(45);
        ll2.insertLast(46);
        ll2.insertLast(47);
        ll2.insertLast(48);
        ll2.insertLast(49);
        ll2.insert(50);
        ll2.insert(51);
        ll2.insert(52);

    }
}
