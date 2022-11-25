//package com.LinkedList.LLquestion;
//
//import com.LinkedList.Ll;
//
////recursive insertion in linkedlist
//public class Rec_LL{
//    static class Node{
//        int value;
//        Node next;
//        public Node(){
//        }
//        public Node(int value) {
//            this.value = value;
//            this.next=null;
//        }
//        public Node(int value, Node next) {
//            this.value = value;
//            this.next=next;
//        }
//    }
//    public int size=0;
//    public Node head = null;
//    public Node tail = null;
//    public static void main(String[] args) {
//
//    }
//    public void insertRec(int val, int index) {
//    head = insertRec(val, index, head);
//    }
//    private Node insertRec(int val, int index, Node node) {
//        //base condition
//        if (index == 0) {
//            Node temp = new Node(val, node);
//            size++;
//            return temp;
//        }
//
//        node.next = insertRec(val, index-1, node.next);
//        return node;
//    }
//
//}
