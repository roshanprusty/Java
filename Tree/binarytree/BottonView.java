package com.Tree.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class BottonView {
        public static class Node{
            int data;
            Node left;
            Node right;
            int hd;

            Node(int data, Node left, Node right){
                this.data=data;
                this.left=left;
                this.right=right;
//                this.hd=hd;
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
        public static void bottonView(Node node){
            if(node == null) return;
            //treemap bcz it will store in sorted order if you don't need in sorted order go fo HM
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            Queue<Node> que = new ArrayDeque<>();
            que.add(node);
            node.hd=0;
            while (!que.isEmpty()){
                Node temp = que.remove();
                int hd= temp.hd;
                tm.put(hd, temp.data);
                if(temp.left!=null){
                    que.add(temp.left);
                    temp.left.hd=hd-1;
                }
                if(temp.right!=null){
                    que.add(temp.right);
                    temp.right.hd=hd+1;
                }
            }
            System.out.println(tm.values());
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
            bottonView(root);
        }
    }


