import java.util.*;

class NodeDepthsIterative {

    public static int nodeDepths(BinaryTree root) {
        int depthSum = 0;
        Stack<Level> stack = new Stack<Level>();
        stack.push(new Level(root, 0));
        while (stack.size() > 0) {
            Level top = stack.pop();
            BinaryTree node = top.root;
            int depth = top.depth;
            if (node == null)
                continue;
            depthSum += depth;
            stack.push(new Level(node.left, depth + 1));
            stack.push(new Level(node.right, depth + 1));
        }
        return depthSum;
    }

    static class Level {
        public BinaryTree root;
        int depth;

        public Level(BinaryTree root, int depth) {
            this.root = root;
            this.depth = depth;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
