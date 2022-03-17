package com.sirKnight;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    static class Node {
        Object data;
        Node left, right = null;
        Node(Object data) {
           this.data = data;
        }
    }

    public static void depthFirst(Node node) {
        Stack<Node> nodesToVisit = new Stack<>();
        Node currentNode = node;
        nodesToVisit.push(currentNode);
        while (nodesToVisit.size()!=0) {
            currentNode = nodesToVisit.pop();
            System.out.println(currentNode.data);
            if(currentNode.right != null) nodesToVisit.push(currentNode.right);
            if(currentNode.left != null) nodesToVisit.push(currentNode.left);
        }
    }

    public static void breadthFirst(Node node) {
        Queue<Node> nodesToVisit = new ArrayDeque<>();
        Node currentNode = node;
        nodesToVisit.add(currentNode);
        while (!nodesToVisit.isEmpty()) {
            currentNode = nodesToVisit.remove();
            System.out.println(currentNode.data);
            if(currentNode.left != null) nodesToVisit.add(currentNode.left);
            if(currentNode.right != null) nodesToVisit.add(currentNode.right);
        }
    }

    public static void main(String[] args) {
        Node a = new Node('a');
        Node b = new Node('b');
        Node c = new Node('c');
        Node d = new Node('d');
        Node e = new Node('e');
        Node f = new Node('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        depthFirst(a);
    }
}
