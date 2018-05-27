package com.smallcode.datastructure;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 二分搜索树
 * 根节点大于左子树，小于右子树，不是完全二叉树
 * 构造字典形式的数据结构
 *
 * @author niele
 * @date 2018/5/25
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value extends Comparable<Value>> {

    public class Node {
        private Key key;
        private Value value;
        private Node left;
        private Node right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            left = right = null;
        }
    }

    private Node root;
    private int count;

    public BinarySearchTree() {
        root = null;
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(Key key, Value value) {
        root = insert(root, key, value);
    }

    /**
     * 插入的时候 先比较根节点，如果如果插入的值等于根节点直接替换
     * 如果插入的值大于根节点的值，在右孩子里面执行插入逻辑
     * 如果插入的值小于根节点的值，在左孩子里面执行插入逻辑
     *
     * @param node
     * @param key
     * @param value
     * @return
     */
    private Node insert(Node node, Key key, Value value) {
        if (node == null) {
            count++;
            return new Node(key, value);
        }
        if (key.compareTo(node.key) == 0) {
            node.value = value;
        } else if (key.compareTo(node.key) > 0) {
            node.right = insert(node.right, key, value);
        } else {
            node.left = insert(node.left, key, value);
        }
        return node;
    }


    /**
     * 查找是不是包含key
     *
     * @param key
     * @return
     */
    public boolean contain(Key key) {
        return contain(root, key);
    }

    private boolean contain(Node node, Key key) {
        if (node == null) {
            return false;
        }
        if (node.key.compareTo(key) == 0) {
            return true;
        } else if (node.key.compareTo(key) > 0) {
            return contain(node.left, key);
        } else {
            return contain(node.right, key);
        }
    }

    public Value search(Key key) {
        return search(root, key);
    }

    private Value search(Node node, Key key) {
        if (node == null) {
            return null;
        }
        if (node.key.compareTo(key) == 0) {
            return node.value;
        } else if (node.key.compareTo(key) > 0) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }


    /**
     * 先序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     * 中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key);
            inOrder(node.right);
        }
    }

    /**
     * 后序遍历
     */
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key);
        }
    }

    public void levelOrder() {
        LinkedBlockingQueue<Node> q = new LinkedBlockingQueue<>();
        try {
            q.put(root);
            while (!q.isEmpty()) {
                Node node = q.take();
                System.out.println(node.key);
                if (node.left != null) {
                    q.put(node.left);
                }
                if (node.right != null) {
                    q.put(node.right);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


