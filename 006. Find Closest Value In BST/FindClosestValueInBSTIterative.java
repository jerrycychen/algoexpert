import java.util.*;
import java.lang.Math.*;

class FindClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBstHelper(tree, target, tree.value);
    }

    private static int findClosestValueInBstHelper(BST node, int target, int closest) {
        BST currentNode = node;
        while (currentNode != null) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
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
