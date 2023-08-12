//package com.Tree.binarySearchTree;
//
//import java.util.ArrayList;
//
//public class LowestCommonAncestors {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data, Node left, Node right){
//            this.data=data;
//            this.left=left;
//            this.right=right;
//        }
//    }
//    public static Node construct(int[] arr, int lo, int hi){
//        if (lo>hi) return null;
//
//        int mid = (lo+hi)/2;
//
//        int data = arr[mid];
//        Node lc = construct(arr, lo, mid-1);
//        Node rc = construct(arr, mid+1, hi);
//
//        Node node = new Node(data, lc, rc);
//        return node;
//    }
//    public static ArrayList<Integer> al = new ArrayList<>();
//    public static int lCA(Node node, int data1, int data2){
//        nodeToRoot(node, data1);
//        ArrayList<Integer> path1=al;
//        al.clear();
//        nodeToRoot(node, data2);
//        return helper(path1, al);
//    }
//    public static boolean nodeToRoot(Node node, int value){
//        if(node==null) return false;
//
//        if(value==node.data) return true;
//
//        boolean fils = nodeToRoot(node.left, value);
//        if(fils) al.add(node.data);
//
//        boolean firs = nodeToRoot(node.right, value);
//        if(firs) al.add(node.data);
//
//        return false;
//    }
//    public static int helper(ArrayList<Integer> p1, ArrayList<Integer> p2){
//        int i=0;
//        for (int data:p1) {
//            i++;
//            if(data!=p2.get(i)) return p2.get(i-1);
//        }
//        return -1;
//    }
//
//    public static void display(Node node){
//        if(node == null) return;
//        String str= "";
//        str+= node.left == null ? "." : node.left.data+"";
//        str+="<-"+node.data+"->";
//        str+=node.right==null? "." : node.right.data +"";
//        System.out.println(str);
//
//        display(node.left);
//        display(node.right);
//    }
//    public static void main(String[] args) {
//        int[] arr ={12, 25, 37, 50, 62, 75, 87};
//        Node root = construct(arr, 0, arr.length-1);
//        display(root);
//        System.out.println(lCA(root,25,37));
//    }
//}
//
