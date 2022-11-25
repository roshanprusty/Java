//package com.LinkedList.LLquestion;
//
//public class Sorting {
//    class Node{
//        int value;
//        Node next;
//
//        public Node(){}
//        public Node(int value) {
//            this.value = value;
//            this.next=null;
//        }
//        public Node(int value, Node next) {
//            this.value = value;
//            this.next=next;
//        }
//    }
//    public Node head = null;
//    public Node tail = null;
//    public int size=0;
//
//    public void insertFirst(int val){
//
//        Node newNode = new Node(val); //one node created
//
//        if(head == null) {
//            head = newNode;
//            tail = newNode;
//        }
//        else {
//            newNode.next=head;
//            head=newNode;
//        }
//        size++;
//    }
//    public void insertLast(int val){
//        if (tail == null) {
//            insertFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size++;
//    }
//    public void insertMid(int value,int pos){
//        if(pos==size) {
//            insertLast(value);
//            return;
//        }
//        if(pos==0) {
//            insertFirst(value);
//            return;
//        }
//
//        Node tempNode=head;
//
//        for (int i = 1; i < pos; i++) {
//            tempNode=tempNode.next;
//        }
//        Node newNode = new Node(value,tempNode.next);
//        tempNode.next=newNode;
//
//        size++;
//
//    }
//
//    public void deleteFirst(){
//        head=head.next;
//        if(head==null){
//            tail=null;
//        }
//        size--;
//        return;
//    }
//    public void deleteLast(){
//        if(size<=1)  {
//            deleteFirst();
//            return;
//        }
//        Node secondLast=get(size-2);
//        secondLast.next=null;
//        size--;
//    }
//    public void deleteMid(int index){
//        Node node = get(index-1);
//        Node temp = node.next;
//        node.next=temp.next;
//        size--;
//
//    }
//    public Node get(int index){
//        Node node = head;
//        for (int i = 0; i < index; i++) {
//            node=node.next;
//        }
//        return node;
//    }
//    public void display(){
//        Node current=head;
//        if(head == null) System.out.println("List is empty");
//        System.out.println("Nodes of singly LinkedList : ");
//        while (current.next != null){
//            System.out.print(current.value+" ");
//            current=current.next;
//        }
//        System.out.println();
//    }
//    public Sorting sortList(Sorting head) {
//        Sorting mid = middleNode(head);
//        Sorting left = sortList(head);
//        Sorting right = sortList(mid);
//        return merge(left,right);
//    }
//    public Sorting middleNode(Sorting head) {
//        Sorting fast=head;
//        Sorting slow=head;
//        while (fast != null && fast.Node.next != null){
//            slow=slow.Node.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//    public Sorting merge(Sorting first, Sorting second) {
//        Node f = first.head;
//        Node s = second.head;
//
//        Sorting ans = new Sorting();
//        while (f  != null && s != null) {
//            if (f.value < s.value) {
//                ans.insertLast(f.value);
//                f = f.next;
//            } else{
//                ans.insertLast(s.value);
//                s = s.next;
//            }
//        }
//
//        while (s != null) {
//            ans.insertLast(s.value);
//            s = s.next;
//        }
//
//        while (f != null) {
//            ans.insertLast(f.value);
//            f = f.next;
//
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//
//
//    }
//
//}
