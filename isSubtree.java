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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if ((s!=null && t==null) || (t!=null && s==null)) return false;
        if (s!=null && t!=null) {
            //System.out.println("s="+s.val+"; t="+t.val);
            if (s.val==t.val) {
                //System.out.println("inside: s="+s.val+"; t="+t.val);
                return isSubtree(s.left,t.left) && isSubtree(s.right,t.right);

            } else {
                return isSubtree(s.left,t) || isSubtree(s.right,t);
            }
        }
        return true;
    }
}
