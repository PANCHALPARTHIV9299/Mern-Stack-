import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class D24DCE138_CIE_1 {

    public static void main(String[] args) {

        // ----- Creating the tree EXACTLY as given in SET B -----

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);

        // ----- Boundary Traversal -----
        ArrayList<Integer> result = boundaryTraversal(root);

        System.out.println(result);
    }

    static ArrayList<Integer> boundaryTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        // 1. Add root
        ans.add(root.data);

        // 2. Left boundary (excluding leaf)
        addLeftBoundary(root.left, ans);

        // 3. Leaf nodes
        addLeafNodes(root, ans);

        // 4. Right boundary (excluding leaf, reversed)
        ArrayList<Integer> right = new ArrayList<>();
        addRightBoundary(root.right, right);
        Collections.reverse(right);
        ans.addAll(right);

        return ans;
    }

    static void addLeftBoundary(Node node, ArrayList<Integer> ans) {
        while (node != null) {

            if (!(node.left == null && node.right == null))
                ans.add(node.data);

            if (node.left != null)
                node = node.left;
            else
                node = node.right;
        }
    }

    static void addLeafNodes(Node node, ArrayList<Integer> ans) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            ans.add(node.data);
            return;
        }

        addLeafNodes(node.left, ans);
        addLeafNodes(node.right, ans);
    }

    static void addRightBoundary(Node node, ArrayList<Integer> ans) {
        while (node != null) {

            if (!(node.left == null && node.right == null))
                ans.add(node.data);

            if (node.right != null)
                node = node.right;
            else
                node = node.left;
        }
    }
}
