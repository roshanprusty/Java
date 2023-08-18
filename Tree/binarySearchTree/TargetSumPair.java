package com.Tree.binarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetSumPair {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static Node construct(int[] arr, int lo, int hi){
        if (lo>hi) return null;

        int mid = (lo+hi)/2;

        int data = arr[mid];
        Node lc = construct(arr, lo, mid-1);
        Node rc = construct(arr, mid+1, hi);

        Node node = new Node(data, lc, rc);
        return node;
    }

    public static void display(Node node){
        if(node == null) return;
        String str= "";
        str+= node.left == null ? "." : node.left.data+"";
        str+="<-"+node.data+"->";
        str+=node.right==null? "." : node.right.data +"";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }
    public static HashMap<Integer, Integer> hm = new HashMap<>();
    public static List<ArrayList<Integer>> ans(Node node, int target){
        List<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        targetSumPair(node,target);

        return list;
    }
    public static void targetSumPair(Node node, int target){
        if(node==null) return;
        if(node.data<=target) hm.put(node.data, 1);
        targetSumPair(node.left,target);
        targetSumPair(node.right,target);
        return;
    }
    public static void main(String[] args) {
        int[] arr ={12, 25, 37, 50, 62, 75, 87};
        Node root = construct(arr, 0, arr.length-1);
        System.out.println(ans(root, 87));

    }
}

