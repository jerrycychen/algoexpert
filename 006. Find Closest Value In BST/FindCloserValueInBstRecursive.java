import java.util.*;

class FindCloserValueInBstRecursive {
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST node, int target, int closest) {
        if (Math.abs(target - closest) > Math.abs(target - node.value)) {
            closest = node.value;
        }
        if (target < node.value && node.left != null) {
            return findClosestValueInBst(node.left, target, closest);
        } else if (target > node.value && node.right != null) {
            return findClosestValueInBst(node.right, target, closest);
        } else {
            return closest;
        }
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
