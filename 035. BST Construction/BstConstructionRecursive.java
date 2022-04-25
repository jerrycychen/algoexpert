import java.util.*;

class Program {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        // Average: O(log(n)) time | O(log(n)) space
        // Worst: O(n) time | O(n) space
        public BST insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    BST newBST = new BST(value);
                    left = newBST;
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    BST newBST = new BST(value);
                    right = newBST;
                } else {
                    right.insert(value);
                }
            }
            return this;
        }

        // Average: O(log(n)) time | O(log(n)) space
        // Worst: O(n) time | O(n) space
        public boolean contains(int value) {
            if (value < this.value) {
                if (left == null) {
                    return false;
                } else {
                    return left.contains(value);
                }
            } else if (value > this.value) {
                if (right == null) {
                    return false;
                } else {
                    return right.contains(value);
                }
            } else {
                return true;
            }
        }

        // Average: O(log(n)) time | O(log(n)) space
        // Worst: O(n) time | O(n) space
        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            if (value < this.value) {
                if (left != null) {
                    left.remove(value, this);
                }
            } else if (value > this.value) {
                if (right != null) {
                    right.remove(value, this);
                }
            } else {
                // When the current node is the value we are removing
                if (left != null && right != null) {
                    // When the removing node has 2 children
                    this.value = right.getMinValue();
                    right.remove(this.value, this);
                } else if (parent == null) {
                    // When the removing node has 1 child or none
                    // And when it is the first recursion, with no parent node assigned yet
                    // AKA this is a root
                    if (left != null) {
                        // Get to do direct children assignments cause right branch is empty
                        this.value = left.value;
                        right = left.right;
                        left = left.left;
                    } else if (right != null) {
                        // Get to do direct children assignments cause left branch is empty
                        this.value = right.value;
                        left = right.left;
                        right = right.right;
                    } else {
                        // This is a single-node tree; do nothing.
                    }
                } else if (parent.left == this) {
                    // If the removing node is parent's left child
                    parent.left = left != null ? left : right;
                } else if (parent.right == this) {
                    // If the removing node is parent's right child
                    parent.right = left != null ? left : right;
                }
            }
        }

        public int getMinValue() {
            if (left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
        }
    }
}