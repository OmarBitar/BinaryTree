package com.sirKnight;

import java.util.Stack;

public class Main {

    static class Node {
        Object data;
        Node left, right = null;
        Node(Object data) {
           this.data = data;
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
    }
}
