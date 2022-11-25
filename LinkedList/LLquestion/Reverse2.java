package com.LinkedList.LLquestion;
//https://leetcode.com/problems/reverse-linked-list-ii/
public class Reverse2 {
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
    public Node head=null;
    public Node tail=null;
    public void insertLast(int value){
        Node node = new Node();
        if(head==null){
            tail=node;
            node.value=value;
            node.next=null;
            tail=node;
            head=node;
            return;
        }
        tail.next=node;
        node.value=value;
        node.next=null;
        tail=node;
    }
    public void display(){
        Node current=head;
        if(head == null) System.out.println("List is empty");
        System.out.println("Nodes of singly LinkedList : ");
        while (current != null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.println();
    }
    public Node reverseBetween( int left, int right) {
        if(left==right) return head;
        Node save1=head;
        Node save2=head;

        while (right>2){
            save2=save2.next;
            right--;
        }

        while (left>2){
            save1=save1.next;
            left--;
        }
        Node prev=save1;
        Node curr=prev.next;
        Node frwd=curr.next;
        while (curr.next != save2){
            curr.next=prev;
            prev=curr;
            curr=frwd;
            if(frwd.next!=save2) frwd=frwd.next;
        }
        curr.next=prev;
        save1.next.next=save2;
        save1.next=curr;

        return head;

    }

    public static void main(String[] args) {
        Reverse2 rev2 = new Reverse2();
        rev2.insertLast(1);
        rev2.insertLast(2);
        rev2.insertLast(3);
        rev2.insertLast(4);
        rev2.insertLast(5);
        rev2.display();
        rev2.reverseBetween(1,2);
        rev2.display();
    }
}
