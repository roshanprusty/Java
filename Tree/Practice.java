package com.Tree;
import java.util.*;

public class Practice {
//    https://www.geeksforgeeks.org/top-50-tree-coding-problems-for-interviews/

    public Practice() {
    }

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
    public static class Pair{
        Node node;
        int state;
        Pair(Node node, int state){
            this.node=node;
            this.state=state;
        }
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
    public static int height(Node node){
        if(node==null) return 0;
        int lefty = height(node.left);
        int righty= height(node.right);
        int height = Math.max(lefty, righty)+1;
        return height;
    }
    public static boolean identical(Node node, Node node2) {
//        https://www.geeksforgeeks.org/write-c-code-to-determine-if-two-trees-are-identical/
        if (node == null && node2 == null) return true;
        if (node == null || node2 == null) return false;

        if (node.data != node2.data) return false;
        boolean leftIdentical = identical(node.left, node2.left);
        boolean rightIdentical = identical(node.right, node2.right);
        return leftIdentical && rightIdentical;
    }
    public static void mirror(Node node){
        if(node==null) return;
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
        mirror(node.left);
        mirror(node.right);
        return;
    }
    public static int isSumProperty(Node node){
        if(node==null) return 0;
        int left = (node.left!=null) ? node.left.data : 0;
        int right = (node.right!=null) ? node.right.data : 0;
        if(left+right!=node.data) return -1;
        if(node.left.data+node.right.data!= node.data) return -1;
        isSumProperty(node.left);
        isSumProperty(node.right);
        return 1;
    }
    public static void largestValue(Node node){
        Queue<Node> que = new LinkedList<>();
        que.add(node);
        ArrayList<Integer> al = new ArrayList<>();
        while (!que.isEmpty()){
            int size = que.size();
            int maxi = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                Node remove = que.poll();
                maxi = Math.max(maxi, remove.data);
                if (remove.left != null) que.add(remove.left);
                if (remove.right != null) que.add(remove.right);
            }
            al.add(maxi);
        }
        System.out.println(al);
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (helper(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean helper(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return (root.data == subRoot.data) && helper(root.left, subRoot.left) && helper(root.right, subRoot.right);
    }
    public static int val=0;
    public static int helper(Node node){
        if(node==null) return 0;
        int lefty=helper(node.left);
        int righty=helper(node.right);
        val=Math.max(lefty,righty)+1;
        return val;
    }
    public static void greetings(){
        System.out.println("hi");
    }


    public static void main(String[] args) {
        Integer[] arr={50, 25, 12, null, null, 37, 30, null,
                null, null, 75, 62, null, 70, null, null, 87, null, null};

        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);
        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx=0;

        while (st.size()>0){
            Pair top = st.peek();
            if(top.state==1){
                //left
                idx++;
                if(arr[idx]!=null){
                    top.node.left = new Node(arr[idx],null, null);
                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;
            } else if (top.state==2) {
                //right
                idx++;
                if(arr[idx]!=null){
                    top.node.right = new Node(arr[idx],null, null);
                    Pair rp = new Pair(top.node.right,1);
                    st.push(rp);
                }else{
                    top.node.right=null;
                }
                top.state++;
            }else {
                st.pop();
            }
        }
//        System.out.println(height(root));

//        System.out.println(identical(root,root));

//        display(root); mirror(root); display(root);

//        System.out.println(isSumProperty(root));

//        display(root); largestValue(root);
        System.out.println(height(root));
    }
}

