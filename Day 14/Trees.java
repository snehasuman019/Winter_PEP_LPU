// package Day 14;

import java.util.*;
public class Trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }
    static Node root;
    static void insert(int d){
        Node newNode = new Node(d);
        if(root==null){
            root = newNode;
            return ;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Node temp = que.poll();
            if(temp.left==null){
                temp.left = newNode;
                return;
            }
            else{
                que.offer(temp.left);
            }
            if(temp.right == null){
                temp.right = newNode;
                return;
            }
            else{
                que.offer(temp.right);
            }
        }
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);

    }
    static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            Node temp = que.poll();
            System.out.println(temp.data+ " ");
            if(temp.left!=null) que.offer(temp.left);
            if(temp.right!=null)que.offer(temp.right);

        }
    }
    static boolean search(int key){
        if(root == null) return false;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node temp=que.poll();
            if(temp.data == key) return true;
            if(temp.left!=null)que.offer(temp.left);
            if(temp.right!=null)que.offer(temp.right);
        }
        return false;
    }
    static int height(Node root){
        if(root == null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));

    }
    public static void main(String[] args){
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        System.out.println("preorder");
        preOrder(root);      //output: [10,20,40,50,30]
       System.out.println("Inorder");
        inOrder(root);    //output : 40,50,30,10,20
        System.out.println("Postorder");
        postOrder(root);      //output: 40,50,20,30,10
        System.out.println("LevelOrder");
        levelOrder(root);
        boolean res = search(40);
        System.out.println("Result: " + res);
        System.out.println(height(root));

    }
}
