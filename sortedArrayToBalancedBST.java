/* Sorted Array to Balanced BST */
/* 
 * Given an array where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 *
 * Balanced tree : a height-balanced binary tree is defined as a 
 * binary tree in which the depth of the two subtrees of every node 
 * never differ by more than 1.
 */

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(final List<Integer> a) {

        if (a.size() == 0) {
            return null;
        }

        TreeNode root = new TreeNode(a.get(a.size() / 2));

        root.left = sortedArrayToBST(a.subList(0, a.size() / 2));
        root.right = sortedArrayToBST(a.subList(a.size() / 2 + 1, a.size()));

        return root;
    }
}

