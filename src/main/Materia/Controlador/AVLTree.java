package main.Materia.Controlador;

import main.Materia.Modelo.Node;

public class AVLTree {
    private Node root;

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getHeight();
    }

    private int getBalance(Node node) {
        if (node == null) {
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        } else if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value));
        } else {
            return node; // No duplicate values allowed
        }

        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));

        int balance = getBalance(node);

        // caso izquierda izquierda
        if (balance > 1 && value < node.getLeft().getValue()) {
            System.out.println("Inserted node: " + node.getValue() + ", Balance: " + balance);
            System.out.println("Right rotate on node: " + node.getValue());
            return rightRotate(node);
        }

        // caso derecha derecha
        if (balance < -1 && value > node.getRight().getValue()) {
            System.out.println("Inserted node: " + node.getValue() + ", Balance: " + balance);
            System.out.println("Left rotate on node: " + node.getValue());
            return leftRotate(node);
        }

        // caso izquierda derecha
        if (balance > 1 && value > node.getLeft().getValue()) {
            System.out.println("Inserted node: " + node.getLeft().getValue() + ", Balance: " + getBalance(node.getLeft()));
            node.setLeft(leftRotate(node.getLeft()));
            System.out.println("Right rotate on node: " + node.getValue());
            return rightRotate(node);
        }

        // caso derecha izquierda
        if (balance < -1 && value < node.getRight().getValue()) {
            System.out.println("Inserted node: " + node.getRight().getValue() + ", Balance: " + getBalance(node.getRight()));
            node.setRight(rightRotate(node.getRight()));
            System.out.println("Left rotate on node: " + node.getValue());
            return leftRotate(node);
        }

        System.out.println("Inserted node: " + node.getValue() + ", Balance: " + balance);
        return node;
    }

    private Node rightRotate(Node nodeR) {
        Node x = nodeR.getLeft();
        Node temp = x.getRight();

        x.setRight(nodeR);
        nodeR.setLeft(temp);

        nodeR.setHeight(Math.max(height(nodeR.getLeft()), height(nodeR.getRight())) + 1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);

        // Devolver nueva raíz
        System.out.println("New root after right rotate: " + x.getValue());
        return x;
    }

    private Node leftRotate(Node nodeR) {
        Node y = nodeR.getRight();
        Node temp = y.getLeft();

        y.setLeft(nodeR);
        nodeR.setRight(temp);

        nodeR.setHeight(Math.max(height(nodeR.getLeft()), height(nodeR.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);

        System.out.println("New root after left rotate: " + y.getValue());
        return y;
    }

    public void insert(int value) {
        System.out.println("Nodo a insertar: " + value);
        root = insert(root, value);
        printTree();
        System.out.println("-------");
    }

    public void printTree() {
        printTreeNode(root, "", true);
    }

    private void printTreeNode(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTreeNode(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "├── null");
                }
                if (node.getRight() != null) {
                    printTreeNode(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "│   " : "    ") + "└── null");
                }
            }
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};
        for (int value : values) {
            tree.insert(value);
        }
    }
}
