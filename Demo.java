//package com;
//
//import com.LinkedList.SinglyLL;
//
//public class Demo {
//    class Node{
//        int value;
//        Node next;
//
//        public Node(int value, Node next) {
//            this.value = value;
//            this.next = next;
//        }
//        public Node(int value) {
//            this.value = value;
//        }
//        public Node() {
//        }
//    }
//    public Node head=null;
//    public Node tail=null;
//    public void insertLast(int value){
//        Node node = new Node();
//        if(head==null){
//            tail=node;
//            node.value=value;
//            node.next=null;
//            tail=node;
//            head=node;
//            return;
//        }
//        tail.next=node;
//        node.value=value;
//        node.next=null;
//        tail=node;
//    }
//    public void display(){
//        Node current=head;
//        if(head == null) System.out.println("List is empty");
//        System.out.println("Nodes of singly LinkedList : ");
//        while (current != null){
//            System.out.print(current.value+" ");
//            current=current.next;
//        }
//        System.out.println();
//    }
//    public void reversing(){
//
//        Node prev=null;
//        Node curr=head;
//        Node frwd=curr.next;
//        while (curr.next != null){
//            curr.next=prev;
//            prev=curr;
//            curr=frwd;
//            if(frwd.next!=null) frwd=frwd.next;
//        }
//        curr.next=prev;
//        head=curr;
//    }
//
//    public static void main(String[] args) {
//        ReversingLL rl = new ReversingLL();
//        rl.insertLast(2);
//        rl.insertLast(25);
//        rl.insertLast(2599);
//        rl.insertLast(253);
//        rl.insertLast(254);
//        rl.insertLast(21);
//        rl.display();
//        rl.reversing();
//        rl.display();
//    }
//}
