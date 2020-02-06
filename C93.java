package cla;

import java.util.ArrayList;

public class C93 {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (checkDepth(root) == -1) return false;
        else return true;
    }
    int checkDepth(TreeNode root) {
        if (root==null) return 0;
        int left = checkDepth(root.left);
        if (left == -1) return -1;
        int right = checkDepth(root.right);
        if (right == -1) return -1;
        int diff = Math.abs(left - right);
        if (diff > 1) return -1;
        else return 1 + Math.max(left, right);
    }
}
