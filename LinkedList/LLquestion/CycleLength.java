package com.LinkedList.LLquestion;

public class CycleLength {
    class Node{
        int value;
        Node next;

        public Node(){}
        public Node(int value) {
            this.value = value;
            this.next=null;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next=next;
        }
    }
    public Node head = null;
    public Node tail = null;
    public int size=0;

    public void insert(int val){
        Node node = new Node();
        if(head == null){
            head=node;
            tail=node;
            node.value=val;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }


    //cycle exist or not
   public boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }
    //length of cycle
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

    public static void main(String[] args) {
        CycleLength list = new CycleLength();
        list.insert(24);
        list.insert(11);
        list.insert(96);
        list.insert(04);
        System.out.println(list.hasCycle());
        System.out.println(list.cycleLength());


    }
    }


