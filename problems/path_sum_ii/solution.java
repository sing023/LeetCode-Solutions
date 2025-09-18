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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answList = new ArrayList<>();
        dfs(root, targetSum, answList,0,new ArrayList<>());
        return answList;
    }

    public void dfs(TreeNode root, int targetSum,List<List<Integer>> answList, int accSum, List<Integer> currentList ) {
        if (root==null) {
            return;
        }
     
        currentList.add(root.val);
        accSum +=root.val;

        if (root.left == null && root.right == null && accSum == targetSum) {
    answList.add(new ArrayList<>(currentList)); // ✅ Add copy
}

        
        dfs(root.left, targetSum, answList,accSum,currentList);
        dfs(root.right, targetSum, answList,accSum,currentList);
        
        //RMB backtracking 
        currentList.remove(currentList.size()-1);
    }
}