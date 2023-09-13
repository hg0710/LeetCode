/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        
        int min = 100000;
        if(node.left!=null)    
            min = minDepth(node.left);
        if(node.right!=null)    
            min = Math.min(minDepth(node.right), min);
        
        return min+1;
    }
}