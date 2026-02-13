// package Day 15;

import java.util.*;
public class trees2 {
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
    static void insertNode(int d){
        Node newNode = new Node(d);
        if(root == null){
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(newNode);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.left==null){
                temp.left = newNode;
                return;
            }
            else{
                q.offer(temp.left);
            }
            if(temp.right == null){
                temp.right = newNode;
                return;
            }
            else{
                q.offer(temp.right);
            }
        }
    }
    static void delete(int key){
        if(root==null) return;
        if(root.left==null && root.right==null && root.data==key)
        {
            root = null;
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            if(temp.data == key){
                keyNode = temp;
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
        if(keyNode != null){
            keyNode.data = temp.data;
            delLastNode(temp);
        }
    }
    static void delLastNode(Node delNode){
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node temp = que.poll();
            if(temp.left == delNode){
                temp.left = null;
                return ;
            }else{
                que.offer(temp.right);
            }
        }
    }
    static int height(Node root){
        if(root==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));

    }
    // static int d=0;
    static int diameter(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left); 
        int rightHeight = height(root.right);
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
        // int left = diameter(root.left);
        // int right = diameter(root.right);
        // d = Math.max(d,left+right)
    }
    static boolean IsEqual(Node root1, Node root2){
        // if(root1.data == root2.data) return true;
        if(root1==null && root2 == null)return true;
        if(root1==null || root2 ==null)return false;
        if(root1.data != root2.data)return false;

        return IsEqual(root1.left, root2.left) && IsEqual(root1.right, root2.right);
    }
    public static void main(String[] args){
        
    }    
}

