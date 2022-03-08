import java.util.*;

class BranchSums {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        List<Integer> sums = new ArrayList<Integer>();
        branchSumsHelper(root, 0, sums);
        return sums;
    }

    private static void branchSumsHelper(BinaryTree root, int sum, List<Integer> sums) {
        if (root == null) {
            return;
        }
        sum += root.value;
        if (root.left == null && root.right == null) {
            sums.add(sum);
            return;
        }
        branchSumsHelper(root.left, sum, sums);
        branchSumsHelper(root.right, sum, sums);
    }
}
