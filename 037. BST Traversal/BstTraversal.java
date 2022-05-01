import java.util.*;

class Program {
    // O(n) time | O(n) space
    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null)
            inOrderTraverse(tree.left, array);
        array.add(tree.value);
        if (tree.right != null)
            inOrderTraverse(tree.right, array);
        return array;
    }

    // O(n) time | O(n) space
    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        array.add(tree.value);
        if (tree.left != null)
            inOrderTraverse(tree.left, array);
        if (tree.right != null)
            inOrderTraverse(tree.right, array);
        return array;
    }

    // O(n) time | O(n) space
    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null)
            inOrderTraverse(tree.left, array);
        if (tree.right != null)
            inOrderTraverse(tree.right, array);
        array.add(tree.value);
        return array;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}