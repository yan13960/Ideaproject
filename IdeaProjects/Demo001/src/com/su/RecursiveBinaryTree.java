package com.su;

import java.util.LinkedList;
import java.util.Stack;

/**
 *递归遍历二叉树
 */
public class RecursiveBinaryTree {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int v) {
            value = v;
        }
    }
    // 先序打印所有节点  前序遍历
    public  static  void perOrder(Node root){
        System.out.println(root.value);
        if (root.left!=null){
            perOrder(root.left);
        }

        if (root.right!=null){
            perOrder(root.right);
        }
}
      //非递归实现先序遍历
     public  static void UnRecursivePreOrder(Node root){
        if (root==null){
            return;
        }
        //创建一个栈
         Stack<Node>stack=new Stack<>();
         stack.push(root);
         while (!stack.isEmpty()){
             Node node=stack.pop();
             System.out.println(node.value);
             if (node.right!=null){
                 stack.push(node.right);
             }
             if (node.left!=null){
                 stack.push(node.left);
             }
         }
   }
    // 队列实现层次遍历
    public static void levelPrint(Node root) {
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<Node>();
        Node node = null;
        queue.offer(root);//将根节点入队
        while (!queue.isEmpty()) {
            node = queue.poll();//出队队头元素并访问
            System.out.println(node.value);
            if (node.left != null)//如果当前节点的左节点不为空入队
            {
                queue.offer(node.left);
            }
            if (node.right != null)//如果当前节点的右节点不为空，把右节点入队
            {
                queue.offer(node.right);
            }
        }
    }

    // 中序遍历
    public  static  void inOrder(Node root){

        if (root.left!=null){
            inOrder(root.left);
        }
        System.out.println(root.value);
        if (root.right!=null){
            inOrder(root.right);
        }
    }

    // 后序遍历
    public  static  void postOrder(Node root){

        if (root.left!=null){
            postOrder(root.left);
        }
        if (root.right!=null){
            postOrder(root.right);
        }
        System.out.println(root.value);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        perOrder(root);
        System.out.println("---------------------");
        UnRecursivePreOrder(root);
        System.out.println("---------------------");
        inOrder(root);
        System.out.println("--------------------");
        postOrder(root);
        System.out.println("---------------------");
        levelPrint(root);
    }
}
